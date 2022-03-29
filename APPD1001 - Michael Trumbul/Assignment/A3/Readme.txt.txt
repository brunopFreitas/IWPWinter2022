Name: Bruno Freitas
ID: W0448225
Course: APPD1001 - User Interface Design and Development

##Assignment 3

In this assignment, we were asked to build a prototype using bootstrap.
The prototype was built using this structure as a template https://getbootstrap.com/docs/5.1/examples/cover/.

###################index.html###################

This file stores the landing page structure of the prototype.
It was designed to be responsive, working with any screen width, and also to have a fixed header and footer.
To make everything work properly, I have imported boostrap.min.css locally, created a few custom styles in the style.css file, and also
imported fontawesome lib to use some icons.

##Body
The body of the index.html is displayed as a flexbox. 

##Background image
I have included a background image that covers the whole page using bootstrap and in-line CSS style.

##Background filter
Over the background image, I have created a layer that works as a filter, making the background image darker and also giving it some blur effect.
Those effects were created using bootstrap and some in-line CSS styles.

##Cover-container
My 3rd layer is the cover-container layer, which is a layer requested by the bootstrap framework and within it, we have the whole site content.

##Header
The header of the page contains the mug icon, the company's logo, and the navigation menu. 
All elements are displayed as flex.

##Mug Icon and Logo
The mug icon and the company's logo are inside an h1 element and using bootstrap they were set to float to the start, so they are positioned slightly to the left.

##NavMenu
The nav menu is justified to center and positioned to right using float right class from bootstrap.
I have removed some styles that were applied to it in the template to make them match the given example.

##Main
The main content is composed of an h1 heading, a paragraph, and a call to action button.
The h1 style is the bootstrap's default style for headings type h1.
The paragraph contains the lead style from bootstrap.
The call to action button was created also using bootstrap default settings for buttons.

##Footer
The footer of the page contains a paragraph and an icon imported from awesomelib.

##Margin and Padding
Some elements have margin and padding dimensions changed by bootstrap classes.

###################action.html###################

This is the link page for the call to action button, Beer and Contact Us menu items.
This page contains:
The same background image and effects as index.html
The same footer as index.html
The same header as index.html

##Main
In this part, I have included an Article > Section > Paragraph containing some lore Ipsum text.
I have applied a bootstrap style to make every first letter capital and also used a custom
CSS style to justify the text as this version of bootstrap does not have a class to do that.

My HTML and CSS files are commented to clarify the use of bootstrap and custom CSS styles.