package com.j2ee.xizhao.uitl.contact;

import com.j2ee.xizhao.domain.ContactList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * <p> Date: 13-5-17 Time: 下午5:15 </p>
 *
 * @author xizhao.xsz
 */
public class RemoveContactAction extends ContactsAction {
    @Override
    public String perform(final HttpServletRequest request, final HttpServletResponse response) {
        int contactId = Integer.parseInt(request.getParameter("id"));

        HttpSession session = request.getSession();
        ContactList contacts = (ContactList) session.getAttribute("contacts");
        contacts.removeContact(contactId);
        session.setAttribute("contacts", contacts);

        return "/contactList.jsp";
    }

    @Override
    public void writeToResponseStream(final HttpServletResponse response, final String output) {
        throw new RuntimeException("This method is not implemented yet!");
    }
}
