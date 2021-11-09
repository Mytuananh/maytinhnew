<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/9/2021
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>

    <title>Calculator</title>
  </head>
  <body>
  <h2>Simple Calculator</h2>
  <form action="/CalculatorServlet" method="post">
    <fieldset >
    <legend>Calculator</legend>
      <table>
        <tr>
    <td><label>First operand: </label></td>
    <td><input type="text" name="first" placeholder="Enter number: "></td>
        </tr>
        <tr>
    <td><label>Operator: </label></td>
    <td><select name="operator">
      <option name="cong" value="cong">Cong</option>
      <option name="tru" value="tru">Tru</option>
      <option name="nhan" value="nhan">Nhan</option>
      <option name="chia" value="chia">Chia</option>
    </select></td>
      </tr>
        <tr>
          <td><label>Second operand: </label></td>
          <td><input type="text" name="second" placeholder="Enter number: "></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" id="submit" value="Calculate"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
