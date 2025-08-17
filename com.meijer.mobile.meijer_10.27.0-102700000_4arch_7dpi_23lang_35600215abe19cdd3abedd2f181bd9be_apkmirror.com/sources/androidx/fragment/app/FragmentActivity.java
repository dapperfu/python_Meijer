package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.b;
import androidx.view.AbstractC6023l;
import androidx.view.C6032u;
import androidx.view.ComponentActivity;
import androidx.view.g0;
import androidx.view.h0;
import f.InterfaceC13782b;
import g.AbstractC14149e;
import g.InterfaceC14150f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o2.InterfaceC15993a;
import p2.InterfaceC16238u;
import p2.InterfaceC16247z;
import x4.f;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements b.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C6032u mFragmentLifecycleRegistry;
    final C5980v mFragments;
    boolean mResumed;
    boolean mStopped;

    class a extends AbstractC5982x<FragmentActivity> implements Z1.c, Z1.d, androidx.core.app.r, androidx.core.app.s, h0, androidx.view.J, InterfaceC14150f, x4.i, K, InterfaceC16238u {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.K
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // p2.InterfaceC16238u
        public void addMenuProvider(InterfaceC16247z interfaceC16247z) {
            FragmentActivity.this.addMenuProvider(interfaceC16247z);
        }

        @Override // Z1.c
        public void addOnConfigurationChangedListener(InterfaceC15993a<Configuration> interfaceC15993a) {
            FragmentActivity.this.addOnConfigurationChangedListener(interfaceC15993a);
        }

        @Override // androidx.core.app.r
        public void addOnMultiWindowModeChangedListener(InterfaceC15993a<androidx.core.app.j> interfaceC15993a) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(interfaceC15993a);
        }

        @Override // androidx.core.app.s
        public void addOnPictureInPictureModeChangedListener(InterfaceC15993a<androidx.core.app.v> interfaceC15993a) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(interfaceC15993a);
        }

        @Override // Z1.d
        public void addOnTrimMemoryListener(InterfaceC15993a<Integer> interfaceC15993a) {
            FragmentActivity.this.addOnTrimMemoryListener(interfaceC15993a);
        }

        @Override // androidx.fragment.app.AbstractC5982x, androidx.fragment.app.AbstractC5979u
        public View c(int i10) {
            return FragmentActivity.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC5982x, androidx.fragment.app.AbstractC5979u
        public boolean d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // g.InterfaceC14150f
        public AbstractC14149e getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.view.InterfaceC6030s
        public AbstractC6023l getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.view.J
        /* renamed from: getOnBackPressedDispatcher */
        public androidx.view.G getDispatcher() {
            return FragmentActivity.this.getDispatcher();
        }

        @Override // x4.i
        public x4.f getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.view.h0
        /* renamed from: getViewModelStore */
        public g0 getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String() {
            return FragmentActivity.this.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }

        @Override // androidx.fragment.app.AbstractC5982x
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC5982x
        public LayoutInflater k() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.AbstractC5982x
        public boolean m(String str) {
            return androidx.core.app.b.y(FragmentActivity.this, str);
        }

        public void q() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.AbstractC5982x
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public FragmentActivity j() {
            return FragmentActivity.this;
        }

        @Override // p2.InterfaceC16238u
        public void removeMenuProvider(InterfaceC16247z interfaceC16247z) {
            FragmentActivity.this.removeMenuProvider(interfaceC16247z);
        }

        @Override // Z1.c
        public void removeOnConfigurationChangedListener(InterfaceC15993a<Configuration> interfaceC15993a) {
            FragmentActivity.this.removeOnConfigurationChangedListener(interfaceC15993a);
        }

        @Override // androidx.core.app.r
        public void removeOnMultiWindowModeChangedListener(InterfaceC15993a<androidx.core.app.j> interfaceC15993a) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(interfaceC15993a);
        }

        @Override // androidx.core.app.s
        public void removeOnPictureInPictureModeChangedListener(InterfaceC15993a<androidx.core.app.v> interfaceC15993a) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(interfaceC15993a);
        }

        @Override // Z1.d
        public void removeOnTrimMemoryListener(InterfaceC15993a<Integer> interfaceC15993a) {
            FragmentActivity.this.removeOnTrimMemoryListener(interfaceC15993a);
        }

        @Override // androidx.fragment.app.AbstractC5982x
        public void p() {
            q();
        }
    }

    public FragmentActivity() {
        this.mFragments = C5980v.b(new a());
        this.mFragmentLifecycleRegistry = new C6032u(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.b.A(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    @Override // androidx.core.app.b.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(AbstractC6023l.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.i(AbstractC6023l.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.z(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new f.b() { // from class: androidx.fragment.app.p
            @Override // x4.f.b
            public final Bundle saveState() {
                return FragmentActivity.o1(this.f55092a);
            }
        });
        addOnConfigurationChangedListener(new InterfaceC15993a() { // from class: androidx.fragment.app.q
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                this.f55093a.mFragments.m();
            }
        });
        addOnNewIntentListener(new InterfaceC15993a() { // from class: androidx.fragment.app.r
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                this.f55094a.mFragments.m();
            }
        });
        addOnContextAvailableListener(new InterfaceC13782b() { // from class: androidx.fragment.app.s
            @Override // f.InterfaceC13782b
            public final void a(Context context) {
                this.f55095a.mFragments.a(null);
            }
        });
    }

    private static boolean markState(FragmentManager fragmentManager, AbstractC6023l.b bVar) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), bVar);
                }
                W w10 = fragment.mViewLifecycleOwner;
                if (w10 != null && w10.getLifecycle().getState().b(AbstractC6023l.b.f55278d)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.getState().b(AbstractC6023l.b.f55278d)) {
                    fragment.mLifecycleRegistry.n(bVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public static /* synthetic */ Bundle o1(FragmentActivity fragmentActivity) {
        fragmentActivity.markFragmentsCreated();
        fragmentActivity.mFragmentLifecycleRegistry.i(AbstractC6023l.a.ON_STOP);
        return new Bundle();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.l().dump(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), AbstractC6023l.b.f55277c)) {
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(AbstractC6023l.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.i(AbstractC6023l.a.ON_DESTROY);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.i(AbstractC6023l.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.i(AbstractC6023l.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.x xVar) {
        androidx.core.app.b.w(this, xVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.x xVar) {
        androidx.core.app.b.x(this, xVar);
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.s(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.t(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.B(this);
    }

    public FragmentActivity(int i10) {
        super(i10);
        this.mFragments = C5980v.b(new a());
        this.mFragmentLifecycleRegistry = new C6032u(this);
        this.mStopped = true;
        init();
    }
}
