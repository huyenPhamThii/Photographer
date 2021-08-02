var slides = document.getElementsByClassName('slide');
var currentSlide = 0;
var slideInterval = setInterval(nextSlide,3000);

function nextSlide(){
    // remove the showing class so the slide with the index 'currentSlide' no longer shows
    slides[currentSlide].className = 'slide';
    // increment the counter so it points to the next slide(the remainder will cycle around from 0 to slides.length-1)
    currentSlide = (currentSlide+1)%slides.length;
    // add the showing class to this slide, so this slide is now showing.
    slides[currentSlide].className = 'slide showing';
}
var playing = true;
function pauseSlideshow(){
	document.getElementById("img-control").src = "images/play.png";
	playing = false;
	clearInterval(slideInterval);
}

function playSlideshow(){
	document.getElementById("img-control").src = "images/pause.png";
	playing = true;
	slideInterval = setInterval(nextSlide,3000);
}
function controlButton(){
	if(playing){
            pauseSlideshow(); 
        }
	else{ 
            playSlideshow(); 
        }
};