package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fullstory.FS;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class LayoutInflaterFactory2C6125y implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    final FragmentManager f55342a;

    /* renamed from: androidx.fragment.app.y$a */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f55343a;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        a(O o10) {
            this.f55343a = o10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f55343a.k();
            this.f55343a.m();
            b0.u((ViewGroup) fragmentK.mView.getParent(), LayoutInflaterFactory2C6125y.this.f55342a).q();
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        O oCreateOrGetFragmentStateManager;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f55342a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K2.c.f16261a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(K2.c.f16262b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(K2.c.f16263c, -1);
        String string = typedArrayObtainStyledAttributes.getString(K2.c.f16264d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !C6123w.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentFindFragmentById = resourceId != -1 ? this.f55342a.findFragmentById(resourceId) : null;
        if (fragmentFindFragmentById == null && string != null) {
            fragmentFindFragmentById = this.f55342a.findFragmentByTag(string);
        }
        if (fragmentFindFragmentById == null && id2 != -1) {
            fragmentFindFragmentById = this.f55342a.findFragmentById(id2);
        }
        if (fragmentFindFragmentById == null) {
            fragmentFindFragmentById = this.f55342a.getFragmentFactory().instantiate(context.getClassLoader(), attributeValue);
            fragmentFindFragmentById.mFromLayout = true;
            fragmentFindFragmentById.mFragmentId = resourceId != 0 ? resourceId : id2;
            fragmentFindFragmentById.mContainerId = id2;
            fragmentFindFragmentById.mTag = string;
            fragmentFindFragmentById.mInLayout = true;
            FragmentManager fragmentManager = this.f55342a;
            fragmentFindFragmentById.mFragmentManager = fragmentManager;
            fragmentFindFragmentById.mHost = fragmentManager.getHost();
            fragmentFindFragmentById.onInflate(this.f55342a.getHost().getContext(), attributeSet, fragmentFindFragmentById.mSavedFragmentState);
            oCreateOrGetFragmentStateManager = this.f55342a.addFragment(fragmentFindFragmentById);
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Fragment " + fragmentFindFragmentById + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentFindFragmentById.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            fragmentFindFragmentById.mInLayout = true;
            FragmentManager fragmentManager2 = this.f55342a;
            fragmentFindFragmentById.mFragmentManager = fragmentManager2;
            fragmentFindFragmentById.mHost = fragmentManager2.getHost();
            fragmentFindFragmentById.onInflate(this.f55342a.getHost().getContext(), attributeSet, fragmentFindFragmentById.mSavedFragmentState);
            oCreateOrGetFragmentStateManager = this.f55342a.createOrGetFragmentStateManager(fragmentFindFragmentById);
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Retained Fragment " + fragmentFindFragmentById + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        L2.b.g(fragmentFindFragmentById, viewGroup);
        fragmentFindFragmentById.mContainer = viewGroup;
        oCreateOrGetFragmentStateManager.m();
        oCreateOrGetFragmentStateManager.j();
        View view2 = fragmentFindFragmentById.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentFindFragmentById.mView.getTag() == null) {
            fragmentFindFragmentById.mView.setTag(string);
        }
        fragmentFindFragmentById.mView.addOnAttachStateChangeListener(new a(oCreateOrGetFragmentStateManager));
        return fragmentFindFragmentById.mView;
    }

    LayoutInflaterFactory2C6125y(FragmentManager fragmentManager) {
        this.f55342a = fragmentManager;
    }
}
