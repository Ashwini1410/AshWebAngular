<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="<c:url value="/resources/cssfile/sidenavbar.css" />" rel="stylesheet">
<script>
      var picPaths1 = ["Chrysanthemum.jpg", "Desert.jpg", "Hydrangeas.jpg", "Jellyfish.jpg", "Koala.jpg", "Lighthouse.jpg", "Penguins.jpg", "Tulips.jpg"];
        var picPaths = ["<c:url value="/resources/images/Chrysanthemum.jpg"/>", "<c:url value="/resources/images/Desert.jpg"/>", "<c:url value="/resources/images/Hydrangeas.jpg"/>"];
            var curPic = -1;
            //preload the images for smooth animation
            var imgO = new Array();            
            
            for(i=0; i < picPaths.length; i++) {
                imgO[i] = new Image();
                imgO[i].src =picPaths[i];
                //"<c:url value="/resources/images/Chrysanthemum.jpg"/>";
                //picPaths[i];
            }

            function swapImage() {
                curPic = (++curPic > picPaths.length-1)? 0 : curPic;
                imgCont.src = imgO[curPic].src;
                setTimeout(swapImage,2000);
            }

            window.onload=function() {
                imgCont = document.getElementById('imgBanner');
                swapImage();
            };
</script>


</head>
<body>

<div class="sidebar">
  <a href="home"><i class="fa fa-fw fa-home"></i> Home</a>
  <a href="#services"><i class="fa fa-fw fa-wrench"></i> Services</a>
  <a href="#clients"><i class="fa fa-fw fa-user"></i> Clients</a>
  <a href="#contact"><i class="fa fa-fw fa-envelope"></i> Contact</a>
 <div class="dropdown">
    <button class="dropbtn">Dropdown 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Link 1</a>
      <a href="#">Link 2</a>
      <a href="#">Link 3</a>
    </div>
  </div> 
</div>

<div class="main">
  <h2>Sidebar with Icons</h2>
   <div>
      <img id="imgBanner" width="100%" height="350" src="" alt="" />
          <!-- width="100%" height="350" src="" alt=""
          style="height: 308px; width: 410px"/>-->
          
   </div>
  <p>This side navigation is of full height (100%) and always shown.</p>
  <p>Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>
  <p>Lorem ipsum dolor sit amet, illum definitiones no quo, maluisset concludaturque et eum, altera fabulas ut quo. Atqui causae gloriatur ius te, id agam omnis evertitur eum. Affert laboramus repudiandae nec et. Inciderint efficiantur his ad. Eum no molestiae voluptatibus.</p>
</div> 


