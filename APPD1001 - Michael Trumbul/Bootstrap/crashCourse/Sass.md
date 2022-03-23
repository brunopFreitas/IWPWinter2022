# Sass

Sass is a framework that allows you to create CSS instructions and compile it, generating .css files to your site.
Sass files end with the .scss

Example:
```css
$main-fonts: Arial, sans-serif;
$headings-color: green;
h1 {
  font-family: $main-fonts;
  color: $headings-color;
}
```

## Partials
Partials in Sass are separate files that hold segments of CSS code.
Names for partials start with the underscore (_) character.
To bring the code in the partial into another Sass file, use the @import directive.
You don't need to use _nameOfTheFile, neither .scss extension while importing.

Example:

```css
@import 'nameOfTheScssFile'
```

## Nesting

Look at this:

```css
nav {
  background-color: red;

  ul {
    list-style: none;

    li {
      display: inline-block;
    }
  }
}
```
## Extends

Works like heritage in OOP.

Example:
```css
.big-panel{
  @extend .panel;
  width: 150px;
  font-size: 2em;
}
```

## Mixins

Are functions.

```css
/* To declare */
@mixin box-shadow($x, $y, $blur, $c){ 
  -webkit-box-shadow: $x $y $blur $c;
  -moz-box-shadow: $x $y $blur $c;
  -ms-box-shadow: $x $y $blur $c;
  box-shadow: $x $y $blur $c;
}
/* To use */
div {
  @include box-shadow(0px, 0px, 4px, #fff);
}
```

You can use conditionals:
- `@if`

Example:
```css
@mixin text-effect($val) {
  @if $val == danger {
    color: red;
  }
  @else if $val == alert {
    color: yellow;
  }
  @else if $val == success {
    color: green;
  }
  @else {
    color: black;
  }
}
```

You can use loops:
- `@for`
  - To stringify: `{$i}`

Example:

```css
@for $j from 1 through 5 {
  .text-#{$j} { font-size: 15px * $j; }
}
```

- `@each`

```css
@each $color in blue, red, green {
  .#{$color}-text {color: $color;}
}
```
```css
/* Same thing, different way */
$colors: (color1: blue, color2: red, color3: green);

@each $key, $color in $colors {
  .#{$color}-text {color: $color;}
}
```

- `@while`

```css
$x: 1;
@while $x < 13 {
  .col-#{$x} { width: 100%/12 * $x;}
  $x: $x + 1;
}
```


