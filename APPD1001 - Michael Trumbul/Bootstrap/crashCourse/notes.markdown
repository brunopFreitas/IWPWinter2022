# Bootstrap

Framework to handle css easily.
You can add multiple classes for a single element to make them appear differently depending on the screen width.


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

### First things first

Everything is inside a container.

```HTML
<body>
    <div class="container">
    ...
    </div>
</body>
```

### Container

.container-fluid: takes 100% of the screen regardless of the screen width.

.container: Depend on the width of the screen, cover an amount of the screen width.

### Grid

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

- .col-size
  - A number between 1 and 12 (position)
  - Or predefined sizes or breakpoints: sm, md, lg, xl (Depend on the screen width in px)

- .col-[breakpoint]-[size].
  - A mix between predefined sizes and position.

- .offset-[breakpoint]-[size]
  - Add blank space between column using the same logic applied to columns.

### Flex
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

- .justify-content-
  - start  : Align at the begining
  - center : Center
  - end : Align at the end
  - between : Evenly space between the elements
  - around : Evenly space around the elements

