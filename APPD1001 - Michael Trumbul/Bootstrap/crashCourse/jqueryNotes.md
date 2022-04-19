# jQuery

All jQuery functions start with a **$**.

jQuery selects an HTML element with a selector, then does something to that element.
- It selects using the name of the element, the id, the class or CSS selectors.

## Structure

To stack functions use .function.function.

### To Add a class

```js
  $(document).ready(function() {
    $("element").addClass("class");
  });
```

### To Remove a class

```js
$("element").removeClass("class");
```

### To change CSS

```js
$("element").css("cssAttribute", "value");
```

### To change HTML

- Property
```js
$("element").prop("nameOfTheProp", value);
```

- Text

```js
$("element").html("value");
```
The `<em>` tag is now widely accepted as the tag for emphasis.

- Remove an element

```js
$("element").remove();
```

- To append an element

```js
$("element").appendTo("element");
```

- To clone an element

```js
$("element").clone().appendTo("element");
```

- To access a parent element

```js
$("element").parent()
```
- To access a children element

```js
$("element").children()
```