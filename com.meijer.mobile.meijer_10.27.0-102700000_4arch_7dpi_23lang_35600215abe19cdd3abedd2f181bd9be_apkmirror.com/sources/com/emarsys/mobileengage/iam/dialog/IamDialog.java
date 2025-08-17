package com.emarsys.mobileengage.iam.dialog;

import I9.e;
import J9.InAppLoadingTime;
import J9.OnScreenTime;
import J9.a;
import J9.d;
import U9.m;
import U9.n;
import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import com.emarsys.mobileengage.iam.dialog.IamDialog;
import da.C13500b;
import io.constructor.data.local.PreferencesHelper;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import ka.InterfaceC15126a;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ma.InAppMetaData;
import ra.C16736a;
import ra.C16739d;
import ra.InterfaceC16741f;
import s9.C16914a;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 W2\u00020\u0001:\u00019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0013¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0012¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0012¢\u0006\u0004\b\u0010\u0010\bJ/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u000e2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b#\u0010$J-\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010\bJ\u0017\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u0010\bJ\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\bJ\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u0010\bJ\u0017\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020?8\u0012@\u0012X\u0092.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010O8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/emarsys/mobileengage/iam/dialog/IamDialog;", "Landroidx/fragment/app/DialogFragment;", "Ls9/a;", "timestampProvider", "Lra/d;", "webViewFactory", "<init>", "(Ls9/a;Lra/d;)V", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lma/b;", "B0", "(Landroid/os/Bundle;)Lma/b;", "", "L0", "H0", "", "html", "inAppMetaData", "Lra/f;", "messageLoadedListener", "Landroid/app/Activity;", "activity", "E0", "(Ljava/lang/String;Lma/b;Lra/f;Landroid/app/Activity;)V", "", "Lka/a;", "actions", "J0", "(Ljava/util/List;)V", "LJ9/c;", "inAppLoadingTime", "K0", "(LJ9/c;)V", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "onResume", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "dismiss", "onPause", "onStop", "onDestroy", "onDestroyView", "outState", "onSaveInstanceState", "a", "Ls9/a;", "b", "Lra/d;", "c", "Ljava/util/List;", "Landroid/widget/FrameLayout;", "d", "Landroid/widget/FrameLayout;", "webViewContainer", "", "e", "J", "startTime", "", "f", "Z", "dismissed", "g", "Ljava/lang/String;", "h", "Lma/b;", "Ljava/lang/ref/WeakReference;", "i", "Ljava/lang/ref/WeakReference;", "activityReference", "Lra/a;", "j", "Lra/a;", "iamWebView", "k", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class IamDialog extends DialogFragment {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C16914a timestampProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16739d webViewFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<? extends InterfaceC15126a> actions;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private FrameLayout webViewContainer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long startTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean dismissed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String html;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private InAppMetaData inAppMetaData;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private WeakReference<Activity> activityReference;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private C16736a iamWebView;

    public IamDialog(C16914a timestampProvider, C16739d webViewFactory) {
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(webViewFactory, "webViewFactory");
        this.timestampProvider = timestampProvider;
        this.webViewFactory = webViewFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0() {
    }

    @TargetApi(33)
    private InAppMetaData B0(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            return (InAppMetaData) savedInstanceState.getSerializable("inAppMetaData", InAppMetaData.class);
        }
        return null;
    }

    private void L0() {
        if (this.dismissed) {
            return;
        }
        long jA = this.timestampProvider.a();
        long j10 = jA - this.startTime;
        Bundle arguments = getArguments();
        long j11 = arguments != null ? arguments.getLong("on_screen_time") : 0L;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.putLong("on_screen_time", j11 + j10);
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.putLong("end_screen_time", jA);
        }
    }

    public void E0(String html, InAppMetaData inAppMetaData, InterfaceC16741f messageLoadedListener, Activity activity) {
        Intrinsics.j(html, "html");
        Intrinsics.j(inAppMetaData, "inAppMetaData");
        Intrinsics.j(messageLoadedListener, "messageLoadedListener");
        Intrinsics.j(activity, "activity");
        this.activityReference = new WeakReference<>(activity);
        this.html = html;
        this.inAppMetaData = inAppMetaData;
        if (this.iamWebView == null) {
            this.iamWebView = this.webViewFactory.a(activity);
        }
        C16736a c16736a = this.iamWebView;
        if (c16736a != null) {
            c16736a.b(html, inAppMetaData, messageLoadedListener);
        }
    }

    public void J0(List<? extends InterfaceC15126a> actions) {
        this.actions = actions;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.j(dialog, "dialog");
        H0();
        super.onCancel(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        View viewInflate = inflater.inflate(n.f35856a, container, false);
        this.webViewContainer = (FrameLayout) viewInflate.findViewById(m.f35855a);
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.j(outState, "outState");
        outState.putString("html", this.html);
        outState.putSerializable("inAppMetaData", this.inAppMetaData);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        C16736a c16736a = this.iamWebView;
        if (c16736a != null) {
            FrameLayout frameLayout = this.webViewContainer;
            if (frameLayout == null) {
                Intrinsics.y("webViewContainer");
                frameLayout = null;
            }
            frameLayout.removeView(c16736a.getWebView());
        }
        super.onStop();
    }

    private void H0() {
        L0();
        Bundle arguments = getArguments();
        if (arguments != null) {
            e.Companion companion = e.INSTANCE;
            Serializable serializable = arguments.getSerializable("loading_time");
            Intrinsics.g(serializable);
            OnScreenTime onScreenTime = new OnScreenTime(arguments.getLong("on_screen_time"), this.startTime, arguments.getLong("end_screen_time"));
            String string = arguments.getString(PreferencesHelper.PREF_ID);
            Intrinsics.g(string);
            companion.g(new d((InAppLoadingTime) serializable, onScreenTime, string, arguments.getString("request_id")));
        } else {
            e.INSTANCE.c(new a("reporting iamDialog", MapsKt.g(TuplesKt.a("error", "iamDialog - arguments has been null"))));
        }
        this.dismissed = true;
    }

    public void K0(InAppLoadingTime inAppLoadingTime) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putSerializable("loading_time", inAppLoadingTime);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        H0();
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Activity activity;
        super.onCreate(savedInstanceState);
        setStyle(2, R.style.Theme.Dialog);
        WeakReference<Activity> weakReference = this.activityReference;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            activity = getActivity();
        }
        String string = this.html;
        Serializable serializable = null;
        if (string == null) {
            if (savedInstanceState != null) {
                string = savedInstanceState.getString("html");
            } else {
                string = null;
            }
        }
        this.html = string;
        InAppMetaData inAppMetaDataB0 = this.inAppMetaData;
        if (inAppMetaDataB0 == null) {
            if (G9.a.f11285a.c()) {
                if (savedInstanceState != null) {
                    serializable = savedInstanceState.getSerializable("inAppMetaData");
                }
                inAppMetaDataB0 = (InAppMetaData) serializable;
            } else {
                inAppMetaDataB0 = B0(savedInstanceState);
            }
        }
        this.inAppMetaData = inAppMetaDataB0;
        if (this.iamWebView == null && activity != null) {
            C16736a c16736aA = this.webViewFactory.a(activity);
            this.iamWebView = c16736aA;
            String str = this.html;
            if (str != null && this.inAppMetaData != null && c16736aA != null) {
                Intrinsics.g(str);
                InAppMetaData inAppMetaData = this.inAppMetaData;
                Intrinsics.g(inAppMetaData);
                c16736aA.b(str, inAppMetaData, new InterfaceC16741f() { // from class: ja.b
                    @Override // ra.InterfaceC16741f
                    public final void a() {
                        IamDialog.F0();
                    }
                });
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C16736a c16736a = this.iamWebView;
        if (c16736a != null) {
            c16736a.c();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            Intrinsics.g(dialog);
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        L0();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        List<? extends InterfaceC15126a> list;
        super.onResume();
        this.startTime = this.timestampProvider.a();
        Bundle arguments = getArguments();
        if (arguments != null && !arguments.getBoolean("isShown", false) && (list = this.actions) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC15126a) it.next()).a(arguments.getString(PreferencesHelper.PREF_ID), arguments.getString("sid"), arguments.getString("url"));
                arguments.putBoolean("isShown", true);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        FrameLayout frameLayout = this.webViewContainer;
        WindowManager.LayoutParams attributes = null;
        if (frameLayout == null) {
            Intrinsics.y("webViewContainer");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        C16736a c16736a = this.iamWebView;
        if (c16736a != null && c16736a.getWebView().getParent() == null) {
            FrameLayout frameLayout2 = this.webViewContainer;
            if (frameLayout2 == null) {
                Intrinsics.y("webViewContainer");
                frameLayout2 = null;
            }
            frameLayout2.addView(c16736a.getWebView());
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window3 = dialog2.getWindow()) != null) {
            window3.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (window != null) {
            attributes = window.getAttributes();
        }
        if (attributes != null) {
            attributes.dimAmount = 0.0f;
        }
        if (window != null) {
            window.setAttributes(attributes);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window2 = dialog3.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
    }

    public IamDialog() {
        this(C13500b.b().T(), C13500b.b().n());
    }
}
