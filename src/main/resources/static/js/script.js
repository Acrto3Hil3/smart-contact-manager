console.log("script loaded in js")

let currentTheme=getTheme()

document.addEventListener('DOMContentLoaded',()=>{
    console.log("DOM content loaded")
  
    // add event listener to theme button
    changeTheme()
})

function changeTheme(){
    console.log(currentTheme)
    document.querySelector('html').classList.add(currentTheme)

    // set theme through theme button
    const themeButton=document.querySelector('#theme_button')
    document.querySelector("span").textContent=currentTheme==="light"?'Dark':'Light'
    themeButton.addEventListener('click',(event)=>{
        console.log("theme button clicked")
        const oldTheme=currentTheme
       /* if(currentTheme==="light"){
            currentTheme="dark"
            document.querySelector('html').classList.remove("light")
            document.querySelector('html').classList.add("dark") 
        }
        else{
            currentTheme="light"
            document.querySelector('html').classList.remove("dark")
            document.querySelector('html').classList.add("light") 
        }*/
       
       // toggle theme
       if(currentTheme==="light"){
           currentTheme="dark"
        }
        else{
            currentTheme="light"
        }     
        setTheme(currentTheme)
        // remove old theme
       document.querySelector('html').classList.remove(oldTheme)

       // add new theme
       document.querySelector('html').classList.add(currentTheme)

       // change theme button text
       document.querySelector("span").textContent=currentTheme==="light"?'Dark':'Light'
    })
}
// set theme to localStorage
function setTheme(theme){
    localStorage.setItem("theme",theme)
    console.log(theme)
}

// get theme from localStorage
function getTheme(){
    let theme = localStorage.getItem("theme")  
    if(theme) return theme
    else return "light"  
}