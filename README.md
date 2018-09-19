# AndroidRecyclerViewInsideScrollView

When put `RecyclerView` to inside `ScrollView`, remember to enable `recyclerView.setNestedScrollingEnabled(false);` to make scroll smooth.
If we don't enable it. Almost device (after tested) still work fine (scroll smooth), but for some device, scroll will lag

> RecyclerView will stop recycle after put to ScrollView
https://stackoverflow.com/a/52309179/5381331