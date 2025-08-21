package com.meijer.mobile.widget;

import Mn.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.P;
import androidx.viewpager.widget.ViewPager;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.core.base.ui.dialogfragment.MeijerDialogFragment;
import com.meijer.mobile.core.design.widget.howTo.WalkThroughType;
import com.meijer.mobile.meijer.Q;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.Z;
import hi.InterfaceC14523a;
import j2.C14923c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yo.C18335a;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0007@HU\u0082\u0001Q8B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J3\u0010\r\u001a\u000e\u0012\n\u0012\b\u0018\u00010\fR\u00020\u00000\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0004J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u0004J\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J+\u0010(\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010\u0004J\u0019\u0010+\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0005H\u0014¢\u0006\u0004\b-\u0010\u0004J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0007H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00052\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\u00052\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b6\u00104R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010b\u001a\u0010\u0012\n\u0012\b\u0018\u00010\fR\u00020\u0000\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010e\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010j\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bf\u0010d\u001a\u0004\bg\u0010h\"\u0004\bi\u0010\u001dR\"\u0010\u001b\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bk\u0010d\u001a\u0004\b\u001b\u0010h\"\u0004\bl\u0010\u001dR\u001b\u0010r\u001a\u00020m8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR$\u0010}\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020T8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007f¨\u0006\u0083\u0001"}, d2 = {"Lcom/meijer/mobile/widget/WalkThroughView;", "Lcom/meijer/mobile/core/base/ui/dialogfragment/MeijerDialogFragment;", "Lcom/google/android/material/tabs/TabLayout$d;", "<init>", "()V", "", "o1", "", "titleResourceId", "descrResourceId", "imageResourceId", "", "Lcom/meijer/mobile/widget/WalkThroughView$d;", "V0", "(III)[Lcom/meijer/mobile/widget/WalkThroughView$d;", "Landroid/view/View;", "rootView", "r1", "(Landroid/view/View;)V", "p1", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "h1", "L0", "", "isCompleted", "M0", "(Z)V", "Lcom/meijer/mobile/widget/WalkThroughView$b;", "listener", "j1", "(Lcom/meijer/mobile/widget/WalkThroughView$b;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "onCreate", "(Landroid/os/Bundle;)V", "n1", "position", "i1", "(I)V", "Lcom/google/android/material/tabs/TabLayout$f;", "tab", "C", "(Lcom/google/android/material/tabs/TabLayout$f;)V", "H", "N", "Lyo/a;", "a", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "appPrefManager", "LDl/e;", "b", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lhi/a;", "c", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "", "", "d", "Ljava/util/List;", "titlesForContentDesc", "LOj/w;", "e", "LOj/w;", "_binding", "Landroidx/viewpager/widget/a;", "f", "Landroidx/viewpager/widget/a;", "Y0", "()Landroidx/viewpager/widget/a;", "m1", "(Landroidx/viewpager/widget/a;)V", "pagerAdapter", "g", "[Lcom/meijer/mobile/widget/WalkThroughView$d;", "pageData", "h", "Z", "canDismissEarly", "i", "getFromSectionWalkThrough", "()Z", "setFromSectionWalkThrough", "fromSectionWalkThrough", "j", "setCompleted", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "k", "Lkotlin/Lazy;", "getWalkThroughType", "()Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "walkThroughType", "l", "Lcom/meijer/mobile/widget/WalkThroughView$b;", "onDismissWalkThroughListener", "Lcom/meijer/mobile/widget/WalkThroughView$c;", "m", "Lcom/meijer/mobile/widget/WalkThroughView$c;", "U0", "()Lcom/meijer/mobile/widget/WalkThroughView$c;", "l1", "(Lcom/meijer/mobile/widget/WalkThroughView$c;)V", "onSwipeWalkThroughListener", "N0", "()LOj/w;", "binding", "n", "WalkThroughFragment", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public class WalkThroughView extends MeijerDialogFragment implements TabLayout.d {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f120502o = 8;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static String f120503p = "com.meijer.mobile.widget.WalkThroughView";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public C18335a appPrefManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Oj.w _binding;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    protected androidx.viewpager.widget.a pagerAdapter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private d[] pageData;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean canDismissEarly;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean fromSectionWalkThrough;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isCompleted;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private b onDismissWalkThroughListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private c onSwipeWalkThroughListener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> titlesForContentDesc = new ArrayList();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy walkThroughType = LazyKt.b(new Function0() { // from class: com.meijer.mobile.widget.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WalkThroughView.t1(this.f120570a);
        }
    });

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/meijer/mobile/widget/WalkThroughView$WalkThroughFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onCreate", "(Landroid/os/Bundle;)V", "", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "b", "getDescription", "setDescription", "description", "", "c", "I", "getImageResource", "()I", "setImageResource", "(I)V", "imageResource", "LOj/q;", "d", "LOj/q;", "_binding", "u0", "()LOj/q;", "binding", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WalkThroughFragment extends Fragment {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f120518f = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String description;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int imageResource;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Oj.q _binding;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/widget/WalkThroughView$WalkThroughFragment$a;", "", "<init>", "()V", "", "title", "description", "", "imageResource", "Lcom/meijer/mobile/widget/WalkThroughView$WalkThroughFragment;", "a", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/meijer/mobile/widget/WalkThroughView$WalkThroughFragment;", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;Ljava/lang/String;I)Landroid/os/Bundle;", "ARGUMENT_TITLE_ID", "Ljava/lang/String;", "ARGUMENT_DESCR_ID", "ARGUMENT_IMAGE_ID", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.widget.WalkThroughView$WalkThroughFragment$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final WalkThroughFragment a(String title, String description, int imageResource) {
                Intrinsics.j(title, "title");
                Intrinsics.j(description, "description");
                WalkThroughFragment walkThroughFragment = new WalkThroughFragment();
                walkThroughFragment.setArguments(WalkThroughFragment.INSTANCE.b(title, description, imageResource));
                return walkThroughFragment;
            }

            @JvmStatic
            public final Bundle b(String title, String description, int imageResource) {
                Intrinsics.j(title, "title");
                Intrinsics.j(description, "description");
                return C14923c.b(TuplesKt.a("argument.walkthrough.title.id", title), TuplesKt.a("argument.walkthrough.descr.id", description), TuplesKt.a("argument.walkthrough.photo.id", Integer.valueOf(imageResource)));
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onDestroyView() {
            this._binding = null;
            super.onDestroyView();
        }

        private final Oj.q u0() {
            Oj.q qVar = this._binding;
            Intrinsics.g(qVar);
            return qVar;
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) throws Resources.NotFoundException {
            Intrinsics.j(inflater, "inflater");
            this._binding = Oj.q.M0(inflater, container, false);
            Resources resources = getResources();
            Intrinsics.i(resources, "getResources(...)");
            int dimensionPixelOffset = resources.getDimensionPixelOffset(Q.f99522k);
            u0().getRoot().setPadding(dimensionPixelOffset, resources.getDimensionPixelOffset(Q.f99523l), dimensionPixelOffset, resources.getDimensionPixelOffset(Q.f99521j));
            TextView textView = u0().f24407D;
            textView.setText(this.title);
            Intrinsics.g(textView);
            Aj.c.a(textView, true);
            u0().f24404A.setText(this.description);
            FS.Resources_setImageResource(u0().f24405B, this.imageResource);
            View root = u0().getRoot();
            Intrinsics.i(root, "getRoot(...)");
            return root;
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            this.title = requireArguments().getString("argument.walkthrough.title.id");
            this.description = requireArguments().getString("argument.walkthrough.descr.id");
            this.imageResource = requireArguments().getInt("argument.walkthrough.photo.id", 0);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00128\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00128\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"Lcom/meijer/mobile/widget/WalkThroughView$a;", "", "<init>", "()V", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "walkThroughType", "", "forceShow", "fromSectionWalkthrough", "cancelable", "dismissViaBackground", "Lcom/meijer/mobile/widget/WalkThroughView;", "b", "(Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;ZZZZ)Lcom/meijer/mobile/widget/WalkThroughView;", "canDismissViaBackground", "Landroid/os/Bundle;", "a", "(Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;ZZZZ)Landroid/os/Bundle;", "", "ARGUMENT_WALKTHROUGH_TYPE", "Ljava/lang/String;", "ARGUMENT_FORCE_SHOW", "ARGUMENT_CLASS", "ARGUMENT_FROM_SECTION_WALKTHROUGH", "ARGUMENT_CANCELABLE", "TAG_ARRAY_TITLES_RESOURCE_ID", "TAG_ARRAY_DESCR_RESOURCE_ID", "TAG_ARRAY_IMG_RESOURCE_ID", "TAG_CAN_DISMISS", "TAG_DISMISS_ON_BG_TOUCH", "", "PAGE_WIDTH", "F", "LAST_PAGE_WIDTH", "TAG_FRAGMENT", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.widget.WalkThroughView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Bundle a(WalkThroughType walkThroughType, boolean forceShow, boolean fromSectionWalkthrough, boolean cancelable, boolean canDismissViaBackground) {
            Intrinsics.j(walkThroughType, "walkThroughType");
            return C14923c.b(TuplesKt.a("tag.walkthrough.candismissearly", Boolean.valueOf(!walkThroughType.isRequired())), TuplesKt.a("walkthroughType", walkThroughType), TuplesKt.a("forceShow", Boolean.valueOf(forceShow)), TuplesKt.a("fromsectionwalkthrough", Boolean.valueOf(fromSectionWalkthrough)), TuplesKt.a("cancelable", Boolean.valueOf(cancelable)), TuplesKt.a("tag.walkthrough.dismissviabackgroundtouch", Boolean.valueOf(canDismissViaBackground)));
        }

        @JvmStatic
        public final WalkThroughView b(WalkThroughType walkThroughType, boolean forceShow, boolean fromSectionWalkthrough, boolean cancelable, boolean dismissViaBackground) {
            Intrinsics.j(walkThroughType, "walkThroughType");
            WalkThroughView walkThroughView = new WalkThroughView();
            walkThroughView.setArguments(C14923c.b(TuplesKt.a("tag.walkthrough.id.of.array.resource.titles", Integer.valueOf(walkThroughType.getTitlesArrayResourceId())), TuplesKt.a("tag.walkthrough.id.of.array.resource.descrs", Integer.valueOf(walkThroughType.getDescriptionsArrayResourceId())), TuplesKt.a("tag.walkthrough.id.of.array.resource.images", Integer.valueOf(walkThroughType.getImagesArrayResourceId())), TuplesKt.a("tag.walkthrough.candismissearly", Boolean.valueOf(!walkThroughType.isRequired())), TuplesKt.a("walkthroughType", walkThroughType), TuplesKt.a("forceShow", Boolean.valueOf(forceShow)), TuplesKt.a("fromsectionwalkthrough", Boolean.valueOf(fromSectionWalkthrough)), TuplesKt.a("cancelable", Boolean.valueOf(cancelable)), TuplesKt.a("tag.walkthrough.dismissviabackgroundtouch", Boolean.valueOf(dismissViaBackground))));
            return walkThroughView;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/widget/WalkThroughView$b;", "", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "type", "", "isComplete", "forceShow", "", "r", "(Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;ZZ)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void r(WalkThroughType type, boolean isComplete, boolean forceShow);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/widget/WalkThroughView$c;", "", "", "page", "", "a", "(I)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        void a(int page);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0010\u0010\u000eR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/widget/WalkThroughView$d;", "", "", "title", "description", "", "imageResource", "<init>", "(Lcom/meijer/mobile/widget/WalkThroughView;Ljava/lang/String;Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "b", "setDescription", "I", "()I", "setImageResource", "(I)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String description;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int imageResource;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ WalkThroughView f120526d;

        public d(WalkThroughView walkThroughView, String title, String description, int i10) {
            Intrinsics.j(title, "title");
            Intrinsics.j(description, "description");
            this.f120526d = walkThroughView;
            this.title = title;
            this.description = description;
            this.imageResource = i10;
        }

        /* renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: b, reason: from getter */
        public final int getImageResource() {
            return this.imageResource;
        }

        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0018\u00010\u0005R\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0018\u00010\u0005R\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/widget/WalkThroughView$e;", "Landroidx/fragment/app/P;", "Landroidx/fragment/app/FragmentManager;", "fm", "", "Lcom/meijer/mobile/widget/WalkThroughView$d;", "Lcom/meijer/mobile/widget/WalkThroughView;", "pageData", "<init>", "(Lcom/meijer/mobile/widget/WalkThroughView;Landroidx/fragment/app/FragmentManager;[Lcom/meijer/mobile/widget/WalkThroughView$d;)V", "", "position", "Landroidx/fragment/app/Fragment;", "t", "(I)Landroidx/fragment/app/Fragment;", "d", "()I", "", "g", "(I)F", "j", "[Lcom/meijer/mobile/widget/WalkThroughView$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class e extends P {

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final d[] pageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FragmentManager fragmentManager, d[] dVarArr) {
            super(fragmentManager, 1);
            Intrinsics.g(fragmentManager);
            this.pageData = dVarArr;
        }

        @Override // androidx.viewpager.widget.a
        public int d() {
            d[] dVarArr = this.pageData;
            if (dVarArr != null) {
                return dVarArr.length;
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.a
        public float g(int position) {
            WalkThroughView.this.Y0().d();
            return 1.0f;
        }

        @Override // androidx.fragment.app.P
        public Fragment t(int position) {
            d[] dVarArr = this.pageData;
            Intrinsics.g(dVarArr);
            d dVar = dVarArr[position];
            WalkThroughFragment.Companion companion = WalkThroughFragment.INSTANCE;
            Intrinsics.g(dVar);
            return companion.a(dVar.getTitle(), dVar.getDescription(), dVar.getImageResource());
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"com/meijer/mobile/widget/WalkThroughView$f", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "a", "(IFI)V", "c", "(I)V", "state", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements ViewPager.j {
        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int state) {
        }

        f() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int position) {
            c onSwipeWalkThroughListener = WalkThroughView.this.getOnSwipeWalkThroughListener();
            if (onSwipeWalkThroughListener != null) {
                onSwipeWalkThroughListener.a(position);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q1(WalkThroughView walkThroughView, View view, MotionEvent motionEvent) {
        walkThroughView.M0(true);
        return true;
    }

    private final void r1(View rootView) {
        rootView.setFocusableInTouchMode(true);
        rootView.requestFocus();
        rootView.setOnKeyListener(new View.OnKeyListener() { // from class: com.meijer.mobile.widget.w
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                return WalkThroughView.s1(this.f120572a, view, i10, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s1(WalkThroughView walkThroughView, View view, int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !walkThroughView.isCancelable()) {
            return false;
        }
        walkThroughView.L0();
        return false;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void H(TabLayout.f tab) {
        Intrinsics.j(tab, "tab");
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public void N(TabLayout.f tab) {
        Intrinsics.j(tab, "tab");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this._binding = null;
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(WalkThroughView walkThroughView, b bVar, WalkThroughType type, boolean z10, boolean z11) {
        Intrinsics.j(type, "type");
        if (type.shouldMarkSeenOnComplete() && (!type.isRequired() || walkThroughView.isCompleted)) {
            C18335a appPrefManager = walkThroughView.getAppPrefManager();
            String strB = type.getTutorialEnum().b();
            Intrinsics.i(strB, "getValue(...)");
            appPrefManager.M(strB, true);
        }
        if (bVar != null) {
            bVar.r(type, walkThroughView.isCompleted, z11);
        }
    }

    private final void p1(View rootView) {
        rootView.setOnTouchListener(new View.OnTouchListener() { // from class: com.meijer.mobile.widget.v
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return WalkThroughView.q1(this.f120571a, view, motionEvent);
            }
        });
    }

    public void C(TabLayout.f tab) {
        Intrinsics.j(tab, "tab");
        i1(tab.g());
    }

    public final void L0() {
        Object serializable;
        if (this.onDismissWalkThroughListener != null) {
            Bundle arguments = getArguments();
            Intrinsics.g(arguments);
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("walkthroughType", WalkThroughType.class);
            } else {
                Object serializable2 = arguments.getSerializable("walkthroughType");
                if (!(serializable2 instanceof WalkThroughType)) {
                    serializable2 = null;
                }
                serializable = (WalkThroughType) serializable2;
            }
            WalkThroughType walkThroughType = (WalkThroughType) serializable;
            boolean z10 = arguments.getBoolean("forceShow");
            b bVar = this.onDismissWalkThroughListener;
            Intrinsics.g(bVar);
            Intrinsics.g(walkThroughType);
            bVar.r(walkThroughType, this.isCompleted, z10);
        }
        dismiss();
    }

    public final void M0(boolean isCompleted) {
        this.isCompleted = isCompleted;
        L0();
    }

    protected final Oj.w N0() {
        Oj.w wVar = this._binding;
        Intrinsics.g(wVar);
        return wVar;
    }

    /* renamed from: U0, reason: from getter */
    public final c getOnSwipeWalkThroughListener() {
        return this.onSwipeWalkThroughListener;
    }

    protected final androidx.viewpager.widget.a Y0() {
        androidx.viewpager.widget.a aVar = this.pagerAdapter;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.x("pagerAdapter");
        return null;
    }

    public final C18335a getAppPrefManager() {
        C18335a c18335a = this.appPrefManager;
        if (c18335a != null) {
            return c18335a;
        }
        Intrinsics.x("appPrefManager");
        return null;
    }

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    protected void h1() throws Resources.NotFoundException {
        if (!this.canDismissEarly && !this.fromSectionWalkThrough && N0().f24448E.getCurrentItem() != Y0().d() - 1) {
            N0().f24448E.N(N0().f24448E.getCurrentItem() + 1, true);
        } else {
            this.isCompleted = true;
            L0();
        }
    }

    public final void j1(final b listener) {
        this.onDismissWalkThroughListener = new b() { // from class: com.meijer.mobile.widget.t
            @Override // com.meijer.mobile.widget.WalkThroughView.b
            public final void r(WalkThroughType walkThroughType, boolean z10, boolean z11) {
                WalkThroughView.k1(this.f120568a, listener, walkThroughType, z10, z11);
            }
        };
    }

    public final void l1(c cVar) {
        this.onSwipeWalkThroughListener = cVar;
    }

    protected final void m1(androidx.viewpager.widget.a aVar) {
        Intrinsics.j(aVar, "<set-?>");
        this.pagerAdapter = aVar;
    }

    protected void n1() throws Resources.NotFoundException {
        m1(new e(getChildFragmentManager(), this.pageData));
        N0().f24448E.setAdapter(Y0());
        N0().f24447D.setupWithViewPager(N0().f24448E);
        TabLayout tutorialPageIndicator = N0().f24447D;
        Intrinsics.i(tutorialPageIndicator, "tutorialPageIndicator");
        d[] dVarArr = this.pageData;
        tutorialPageIndicator.setVisibility((dVarArr != null ? dVarArr.length : 0) <= 1 ? 4 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.j(context, "context");
        c.a aVarB = Mn.a.a().b(context);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        aVarB.a((Mn.d) nu.d.a(applicationContext, Mn.d.class)).build().a(this);
        super.onAttach(context);
        if (context instanceof b) {
            j1((b) context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.j(inflater, "inflater");
        this._binding = Oj.w.M0(inflater, container, false);
        N0().f24448E.setPageMargin(0);
        n1();
        N0().f24448E.c(new f());
        N0().f24447D.h(this);
        i1(0);
        View root = N0().getRoot();
        Intrinsics.i(root, "getRoot(...)");
        r1(root);
        if (requireArguments().getBoolean("tag.walkthrough.dismissviabackgroundtouch")) {
            View root2 = N0().getRoot();
            Intrinsics.i(root2, "getRoot(...)");
            p1(root2);
        }
        o1();
        N0().f24446C.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalkThroughView.a1(this.f120566a, view);
            }
        });
        N0().f24446C.setNavigationIcon(S.f99549H);
        N0().f24444A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.widget.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                WalkThroughView.g1(this.f120567a, view);
            }
        });
        View root3 = N0().getRoot();
        Intrinsics.i(root3, "getRoot(...)");
        return root3;
    }

    private final d[] V0(int titleResourceId, int descrResourceId, int imageResourceId) throws Resources.NotFoundException {
        TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(titleResourceId);
        Intrinsics.i(typedArrayObtainTypedArray, "obtainTypedArray(...)");
        TypedArray typedArrayObtainTypedArray2 = getResources().obtainTypedArray(descrResourceId);
        Intrinsics.i(typedArrayObtainTypedArray2, "obtainTypedArray(...)");
        TypedArray typedArrayObtainTypedArray3 = getResources().obtainTypedArray(imageResourceId);
        Intrinsics.i(typedArrayObtainTypedArray3, "obtainTypedArray(...)");
        if (typedArrayObtainTypedArray.length() == typedArrayObtainTypedArray2.length() && typedArrayObtainTypedArray.length() == typedArrayObtainTypedArray3.length()) {
            d[] dVarArr = new d[typedArrayObtainTypedArray.length()];
            this.titlesForContentDesc.clear();
            int length = typedArrayObtainTypedArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = typedArrayObtainTypedArray.getString(i10);
                Intrinsics.g(string);
                String string2 = typedArrayObtainTypedArray2.getString(i10);
                Intrinsics.g(string2);
                dVarArr[i10] = new d(this, string, string2, typedArrayObtainTypedArray3.getResourceId(i10, 0));
                List<String> list = this.titlesForContentDesc;
                String string3 = typedArrayObtainTypedArray.getString(i10);
                Intrinsics.g(string3);
                list.add(string3);
            }
            typedArrayObtainTypedArray.recycle();
            typedArrayObtainTypedArray2.recycle();
            typedArrayObtainTypedArray3.recycle();
            return dVarArr;
        }
        throw new IllegalArgumentException("WalkThroughView expects ALL three resource arrays to be the same length");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(WalkThroughView walkThroughView, View view) {
        walkThroughView.L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g1(WalkThroughView walkThroughView, View view) throws Resources.NotFoundException {
        walkThroughView.h1();
    }

    private final void o1() {
        TabLayout.f fVarD;
        int tabCount = N0().f24447D.getTabCount();
        List<String> list = this.titlesForContentDesc;
        if (list.isEmpty() || list.size() != tabCount) {
            list = null;
        }
        if (list != null) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
            int i10 = 0;
            for (Object obj : list2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                String str = (String) obj;
                TabLayout.f fVarB = N0().f24447D.B(i10);
                if (fVarB != null) {
                    fVarD = ck.d.d(fVarB, AbstractC6392a.INSTANCE.d(Y.f100790Yh, str, Integer.valueOf(i11), Integer.valueOf(tabCount)));
                } else {
                    fVarD = null;
                }
                arrayList.add(fVarD);
                i10 = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalkThroughType t1(WalkThroughView walkThroughView) {
        Object serializable;
        Bundle bundleRequireArguments = walkThroughView.requireArguments();
        Intrinsics.i(bundleRequireArguments, "requireArguments(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = bundleRequireArguments.getSerializable("walkthroughType", WalkThroughType.class);
        } else {
            Serializable serializable2 = bundleRequireArguments.getSerializable("walkthroughType");
            if (!(serializable2 instanceof WalkThroughType)) {
                serializable2 = null;
            }
            serializable = (WalkThroughType) serializable2;
        }
        Intrinsics.g(serializable);
        return (WalkThroughType) serializable;
    }

    protected void i1(int position) {
        int i10;
        N0().f24444A.setText(getResources().getString(Cj.o.f5100z));
        N0().f24444A.setTextColor(Z1.b.c(N0().f24444A.getContext(), com.meijer.mobile.meijer.P.f99511g));
        boolean z10 = true;
        int i11 = 0;
        if (position != Y0().d() - 1) {
            z10 = false;
        }
        MaterialButton nextActionButton = N0().f24444A;
        Intrinsics.i(nextActionButton, "nextActionButton");
        if (!z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        nextActionButton.setVisibility(i10);
        TextView swipeToContinue = N0().f24445B;
        Intrinsics.i(swipeToContinue, "swipeToContinue");
        if (z10) {
            i11 = 4;
        }
        swipeToContinue.setVisibility(i11);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean z10 = true;
        setStyle(1, Z.f101331c);
        int i10 = requireArguments().getInt("tag.walkthrough.id.of.array.resource.titles", 0);
        int i11 = requireArguments().getInt("tag.walkthrough.id.of.array.resource.descrs", 0);
        int i12 = requireArguments().getInt("tag.walkthrough.id.of.array.resource.images", 0);
        if (i10 > 0 && i11 > 0 && i12 > 0) {
            this.pageData = V0(i10, i11, i12);
        }
        this.fromSectionWalkThrough = requireArguments().getBoolean("fromsectionwalkthrough");
        setCancelable(requireArguments().getBoolean("cancelable", true));
        if (!this.fromSectionWalkThrough && !requireArguments().getBoolean("tag.walkthrough.candismissearly", true)) {
            z10 = false;
        }
        this.canDismissEarly = z10;
    }
}
