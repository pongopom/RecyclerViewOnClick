# RecyclerViewOnClick
The steps to add on click to a basic recyclerview
https://github.com/pongopom/BareBonesRecyclerView
1. In the Adapter class create an interface call it ListItemClickListener.
2. Add a method to the ListItemClickListener interface call it onListItemClick with a parameter type of what ever object you want to pass back to the activity that is in your DataSource.
3. In the Adapter class create a final private variable to hold ListItemClickListener call it listItemClickListener.
4. In the Adapter classes constructor add a parameter to pass in ListItemClickListener and set listItemClickListener to it.
5. Make the viewHolder class implement view.OnClickListener.
6. In the viewHolders constructor setOnClickListener(this) on the view past in.
7. In theViewHolder class override the onClick method.
8. In the onClick method use getAdapterPosition() to get the object at that position in your DataSource.
9. In the onClick method call listItemClickListener.onListItemClick(pass in the object);.
10. In the Activity make the Activity class implement the MyAdapter.ListItemClickListener interface and override its onListItemClick method. This will be called when ever there is a click and will contain the object (see point 2.) from the DataSource at the clicked position.
11. Don’t forget when you create a new instance of adapter in the activity pass in (this) to the ListItemClickListener  param you added to the adapters constructor (see point4.).
