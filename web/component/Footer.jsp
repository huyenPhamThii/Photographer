<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container-fluid footer-wrapper" id="footer"> <!-- this is the Footer Wrapper -->
    <div class="container">
        <div class="footer-info">
            <div class="footer-powered-by">
                <a rel="nofollow" href="http://www.simplesite.com/">Created with SimpleSite</a>
            </div>
        </div>
        <div class="footer-page-counter" style="display: block;">
            <c:forEach items="${sessionScope.numberOfView}" var="i">
                <span class="number">${i}</span>
            </c:forEach>
        </div>
        <div id="css_simplesite_com_fallback" class="hide"></div>
    </div>
</div>