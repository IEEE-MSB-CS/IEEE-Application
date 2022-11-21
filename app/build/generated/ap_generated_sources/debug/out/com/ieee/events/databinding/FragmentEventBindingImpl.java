package com.ieee.events.databinding;
import com.ieee.events.R;
import com.ieee.events.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEventBindingImpl extends FragmentEventBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.event_img, 1);
        sViewsWithIds.put(R.id.back_btn, 2);
        sViewsWithIds.put(R.id.share_btn, 3);
        sViewsWithIds.put(R.id.favourite_btn, 4);
        sViewsWithIds.put(R.id.event_name_txt, 5);
        sViewsWithIds.put(R.id.label_rv, 6);
        sViewsWithIds.put(R.id.attend_people_txt, 7);
        sViewsWithIds.put(R.id.about_event_txt, 8);
        sViewsWithIds.put(R.id.event_details_rv, 9);
        sViewsWithIds.put(R.id.event_speakers_rv, 10);
        sViewsWithIds.put(R.id.branchs_rv, 11);
        sViewsWithIds.put(R.id.events_rv, 12);
        sViewsWithIds.put(R.id.book_event_btn, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEventBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentEventBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (kr.co.prnd.readmore.ReadMoreTextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.ImageView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.ImageView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}