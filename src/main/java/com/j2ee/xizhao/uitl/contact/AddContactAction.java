package com.j2ee.xizhao.uitl.contact;

import com.j2ee.xizhao.domain.Contact;
import com.j2ee.xizhao.domain.ContactList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * <p> Date: 13-5-17 Time: 下午5:14 </p>
 *
 * @author xizhao.xsz
 */
public class AddContactAction extends ContactsAction {
    @Override
    public String perform(final HttpServletRequest request, final HttpServletResponse response) {
        Contact newContact = createContact(request);

        HttpSession session = request.getSession();
        ContactList contacts = (ContactList) session.getAttribute("contacts");
        contacts.addContact(newContact);
        session.setAttribute("contacts", contacts);

        return "/contactList.jsp";
    }

    @Override
    public void writeToResponseStream(final HttpServletResponse response, final String output) {
        throw new RuntimeException("This method is not implemented yet!");
    }

    protected Contact createContact(HttpServletRequest request) {
        Contact contact = new Contact();
        contact.setId(request.getParameter(Contact.ContactParaEnum.ID.getPara()));
        contact.setStreet(request.getParameter(Contact.ContactParaEnum.STREET.getPara()));
        contact.setLastName(request.getParameter(Contact.ContactParaEnum.LAST_NAME.getPara()));
        contact.setFirstName(request.getParameter(Contact.ContactParaEnum.FIRST_NAME.getPara()));
        return contact;
    }


}
