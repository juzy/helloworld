<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page import="com.j2ee.xizhao.*" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page import="com.j2ee.xizhao.domain.Contact" %>
<html>
<head>
    <title>Contacts List 1.0</title>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

    <style type="text/css">
        body, table, hr {
            color: #000000;
            background: silver;
            font-family: Verdana, sans-serif;
            font-size: x-small;
        }
    </style>

</head>

<body>
<jsp:useBean id="contacts" scope="session"
             class="com.j2ee.xizhao.domain.ContactList"/>

<h2>Contact List 1.0</h2>
<hr size="2"/>
<table frame="below" width="100%">
    <tr>
        <th align="left"></th>
        <th align="left">Name</th>
        <th align="left">Street</th>
        <th align="left">City</th>
        <th align="left">State</th>
        <th align="left">Zip</th>
        <th align="left">Type</th>
    </tr>
    <%
        List list = contacts.getContacts();
        for (Iterator i = list.iterator(); i.hasNext(); ) {
            Contact contact = (Contact) i.next();
    %>
    <tr>
        <td width="100"><a
                href="removeContactAction.perform?id=<%= contact.getId()%>"
                >Delete</a></td>
        <td width="200"><%=contact.getFirstName()%> <%=contact.getLastName()%>
        </td>
        <td width="150"><%=contact.getStreet()%>
        </td>



    </tr>
    <%
        }
    %>
</table>
<br/>
<br/>
<br/>
<fieldset>
    <legend><b>Add Contact</b></legend>
    <form method="post" action="addContactAction.perform">
        <table>
            <tr>
                <td>id:
                <td>
                <td><input type="text" size="30" name="id"></td>
            </tr>
            <tr>
                <td>First Name:
                <td>
                <td><input type="text" size="30" name="firstname"></td>
            </tr>
            <tr>
                <td>Last Name:
                <td>
                <td><input type="text" size="30" name="lastname"></td>
            </tr>
            <tr>
                <td>Street:
                <td>
                <td><input type="text" size="30" name="street"></td>
            </tr>



        </table>
        <br/>
        <input type="submit" name="addContact" value="  Add  ">
    </form>
</fieldset>

</body>
</html>