package vn.linh.recyclerviewinsidescrollview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import vn.linh.recyclerviewinsidescrollview.RecyclerItem;
import vn.linh.recyclerviewinsidescrollview.R;

public class OneItemTypeAdapter extends RecyclerView.Adapter<OneItemTypeAdapter.ViewHolder> {
    private static final String TAG = "OneItemTypeAdapter";
    private RecyclerItem[] mData;
    private LayoutInflater mInflater;

    public OneItemTypeAdapter(Context context, RecyclerItem[] data) {
        mInflater = LayoutInflater.from(context);
        mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        View view = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder ");
        RecyclerItem recyclerItem = mData[position];
        holder.bindItem(recyclerItem);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView myTextView;

        private ViewHolder(View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.info_text);
        }

        void bindItem(RecyclerItem recyclerItem) {
            myTextView.setText(recyclerItem.getTitle());
        }
    }
}