# Bootstrap

Framework to handle css easily.
You can add multiple classes for a single element to make them appear differently depending on the screen width.
- class="red-text text-center"

## Lib of Icons

Font Awesome
```HTML
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
```
How to use:
The i element was originally used to make other elements italic, but is now commonly used for icons.

```HTML
<i class="fas fa-info-circle"></i>
```

## Including local files:

```HTML
<!-- for css -->
<link rel="stylesheet" href="path/to/file/bootstrap.min.css">

<!-- for javascript -->
<script type="text/javascript" src="path/to/file/bootstrap.min.js"></script>
```

## Including CDN:

```HTML
<!-- for css -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<!-- for javascript -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
```

## First things first

Everything is inside a container.

```HTML
<body>
    <div class="container">
    ...
    </div>
</body>
```

## Container

.container-fluid: takes 100% of the screen regardless of the screen width.

.container: Depend on the width of the screen, cover an amount of the screen width.

## Breakpoints

Every class has variations for including breakpoints
`.className-[breakpoint]-sintax`

Breakpoints can assume:

|breakpoint | screen size|
|-----------|------------|
|    xs     |   <576px   |
|    sm     |  >=576px   |
|    md     |  >=768px   |
|    lg     |  >=992px   |
|    xl     |  >=1200px  |

## Grid

#### Row
```HTML
<div class="row">
...
</div>
```
Does nothing, have columns as child.

#### Column
```HTML
  <div class="row">
    <div class="col">
      ...
    </div>
```
By default, the Bootstrap 4 grid consists of 12 columns. 

- .col-position
  - A number between 1 and 12 (position)
  - Or predefined sizes or breakpoints: xs, sm, md, lg, xl (Depend on the screen width in px)

- .col-[breakpoint]-[size].
  - A mix between predefined sizes and position.

- .offset-[breakpoint]-[size]
  - Add blank space between column using the same logic applied to columns.

## Flex
In order to use the flex utilies you need to have a flex container.

- .d-flex
  - Takes up the whole width of its parent.

- .d-inline-flex
  - Make its width vary depending on the width of its content.

- .flex-row.
  - Align horizontally from left to right

- .flex-row-reverse
  - Align horizontally from right to left

- .flex-column
  - Align items vertically Top-Bottom

- .flex-column-reverse
  - Align items vertically Bottom-Top

- .justify-content- (main axis - horizontal)
  - start  : Align at the begining
  - center : Center
  - end : Align at the end
  - between : Evenly space between the elements
  - around : Evenly space around the elements

- .align-items- (cross axis - vertical)
  - stretch
  - start
  - end
  - center
  - baseline (along the content inside the element)

- .mr-auto (as much as left possible)
- .ml-auto (as much as right possible)

- .flex-fill (fill the space in the container with the element)

- .flex-grown-# (make the remaining space of the container to go to one element)

- .flex-shrink-# (make an element shrink if there's no space)

- .w-100 (makes an element have 100% width)

- .flex-
  - nowrap (will be bigger than the container)
  - wrap (will move the elements to another row within the container)
  - wrap-reverse (same thing as above, but bottom-top)

## Images
- img-responsive
  - Make images responsive

## Typography
Bootstrap 4’s default font-size is 16px
The classes for colours are defined as `.text-[context]`. 

- .text-
  - primary (Blue text)
  - secondary (Black text)
  - success (Green text)
  - danger (Red text)
  - warning (Yellow text)
  - info (Light blue text)
  - left (align)
  - right (align)
  - center (align)
  - justify (align)
  - lowercase
  - uppercase
  - capitalized
  - weight-
    - bold
    - normal
    - light
  - italic
  - .h# or <h#></h#>
    - heading from **h1** to **h6**
- .display-# (bigger title)
- `<mark></mark>` or .mark (highlight in light color)
- `<kbd></kbd>` (highlight in black)
- `<small></small>` or .small (decrease font size)
- `<del></del>` or `<s></s>` (strike through text)
- `<u></u>` or `<ins></ins>` (underline text)
- `<b></b>` or `<strong></strong>` (also bold text)
- `<i></i>` or `<em></em>` (also make italic text)
- `<abbr></abbr>` (abbreviation - a hint will appear when hovering)
- `<blockquote>` (to create blockquotes)
  - .blockquote  (to create the quote)
- `<code></code>` (single line of code)
  - `<pre></pre>` (multiples line of code)
- 



## Elements

### Button

- btn 
  - Mandatory class
- btn-block
  - Cover the whole width
- btn-default
  - Button has the same size as the word within
- btn-primary
  - Apply some color to the button and is used to focus the button
- btn-info
  - Apply some color to the button and is used to give options
- btn-danger
  - Apply some color to the button and is used to give an alert

### Forms

- form-control
  - Width of 100% to elements within a form

## Visual

- well 
  - Some background style.
