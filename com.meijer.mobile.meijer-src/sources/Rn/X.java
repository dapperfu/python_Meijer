package Rn;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.meijer.mobile.core.design.widget.howTo.WalkThroughType;
import com.meijer.mobile.widget.AppWalkThroughView;
import com.meijer.mobile.widget.MperksCreditCardWalkThroughView;
import com.meijer.mobile.widget.WalkThroughView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import xk.C18188a;
import yo.C18335a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 &2\u00020\u0001:\u0003\u0018\u0019\u0016BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"¨\u0006'"}, d2 = {"LRn/X;", "", "Lyo/a;", "appPrefManager", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "walkThroughType", "Lcom/meijer/mobile/widget/WalkThroughView$b;", "onDismissWalkThroughListener", "Lcom/meijer/mobile/widget/WalkThroughView$c;", "onSwipeWalkThroughListener", "", "forceShow", "fromSectionWalkThrough", "cancelable", "canDismissViaBackground", "<init>", "(Lyo/a;Landroidx/fragment/app/FragmentActivity;Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;Lcom/meijer/mobile/widget/WalkThroughView$b;Lcom/meijer/mobile/widget/WalkThroughView$c;ZZZZ)V", "LRn/X$a;", "builder", "(LRn/X$a;)V", "c", "()Z", "a", "b", "Lyo/a;", "Landroidx/fragment/app/FragmentActivity;", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "d", "Lcom/meijer/mobile/widget/WalkThroughView$b;", "e", "Lcom/meijer/mobile/widget/WalkThroughView$c;", "f", "Z", "g", "h", "i", "j", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f33542k = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18335a appPrefManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final FragmentActivity activity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final WalkThroughType walkThroughType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final WalkThroughView.b onDismissWalkThroughListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WalkThroughView.c onSwipeWalkThroughListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean forceShow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean fromSectionWalkThrough;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean cancelable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean canDismissViaBackground;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R$\u0010)\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0013\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00108\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00101\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\"\u0010:\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b*\u00103\"\u0004\b9\u00105R\"\u0010<\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u00101\u001a\u0004\b#\u00103\"\u0004\b;\u00105¨\u0006="}, d2 = {"LRn/X$a;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "walkThroughType", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;)V", "Lcom/meijer/mobile/widget/WalkThroughView$b;", "listener", "m", "(Lcom/meijer/mobile/widget/WalkThroughView$b;)LRn/X$a;", "Lcom/meijer/mobile/widget/WalkThroughView$c;", "n", "(Lcom/meijer/mobile/widget/WalkThroughView$c;)LRn/X$a;", "", "launchedFromSectionWalkThrough", "l", "(Z)LRn/X$a;", "forceShow", "b", "LRn/X;", "a", "()LRn/X;", "Landroidx/fragment/app/FragmentActivity;", "c", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "k", "()Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "LRn/X$b;", "LRn/X$b;", "f", "()LRn/X$b;", "entryPoint", "d", "Lcom/meijer/mobile/widget/WalkThroughView$b;", "i", "()Lcom/meijer/mobile/widget/WalkThroughView$b;", "setOnDismissWalkThroughListener$Meijer_playstoreRelease", "(Lcom/meijer/mobile/widget/WalkThroughView$b;)V", "onDismissWalkThroughListener", "e", "Lcom/meijer/mobile/widget/WalkThroughView$c;", "j", "()Lcom/meijer/mobile/widget/WalkThroughView$c;", "setOnSwipeWalkThroughListener$Meijer_playstoreRelease", "(Lcom/meijer/mobile/widget/WalkThroughView$c;)V", "onSwipeWalkThroughListener", "Z", "g", "()Z", "setForceShow$Meijer_playstoreRelease", "(Z)V", "h", "setFromSectionWalkThrough$Meijer_playstoreRelease", "fromSectionWalkThrough", "setCancelable$Meijer_playstoreRelease", "cancelable", "setCanDismissViaBackground$Meijer_playstoreRelease", "canDismissViaBackground", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final FragmentActivity activity;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final WalkThroughType walkThroughType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final b entryPoint;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private WalkThroughView.b onDismissWalkThroughListener;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private WalkThroughView.c onSwipeWalkThroughListener;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean forceShow;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean fromSectionWalkThrough;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean cancelable;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean canDismissViaBackground;

        public a(FragmentActivity activity, WalkThroughType walkThroughType) {
            Intrinsics.j(activity, "activity");
            Intrinsics.j(walkThroughType, "walkThroughType");
            this.activity = activity;
            this.walkThroughType = walkThroughType;
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.i(applicationContext, "getApplicationContext(...)");
            this.entryPoint = (b) nu.d.a(applicationContext, b.class);
            this.cancelable = true;
        }

        public final X a() {
            return new X(this);
        }

        public final a b(boolean forceShow) {
            this.forceShow = forceShow;
            return this;
        }

        /* renamed from: c, reason: from getter */
        public final FragmentActivity getActivity() {
            return this.activity;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getCanDismissViaBackground() {
            return this.canDismissViaBackground;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getCancelable() {
            return this.cancelable;
        }

        /* renamed from: f, reason: from getter */
        public final b getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getForceShow() {
            return this.forceShow;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getFromSectionWalkThrough() {
            return this.fromSectionWalkThrough;
        }

        /* renamed from: i, reason: from getter */
        public final WalkThroughView.b getOnDismissWalkThroughListener() {
            return this.onDismissWalkThroughListener;
        }

        /* renamed from: j, reason: from getter */
        public final WalkThroughView.c getOnSwipeWalkThroughListener() {
            return this.onSwipeWalkThroughListener;
        }

        /* renamed from: k, reason: from getter */
        public final WalkThroughType getWalkThroughType() {
            return this.walkThroughType;
        }

        public final a l(boolean launchedFromSectionWalkThrough) {
            this.fromSectionWalkThrough = launchedFromSectionWalkThrough;
            return this;
        }

        public final a m(WalkThroughView.b listener) {
            this.onDismissWalkThroughListener = listener;
            return this;
        }

        public final a n(WalkThroughView.c listener) {
            this.onSwipeWalkThroughListener = listener;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"LRn/X$b;", "", "Lyo/a;", "i", "()Lyo/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        C18335a i();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LRn/X$c;", "", "<init>", "()V", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "walkThroughType", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "", "a", "(Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;Landroidx/fragment/app/FragmentActivity;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Rn.X$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean a(WalkThroughType walkThroughType, FragmentActivity fragmentActivity) {
            Intrinsics.j(walkThroughType, "walkThroughType");
            Intrinsics.j(fragmentActivity, "fragmentActivity");
            C18188a.f170828a.a(WalkThroughView.INSTANCE.b(walkThroughType, true, true, true, true), fragmentActivity, WalkThroughView.f120503p);
            return true;
        }
    }

    public X(C18335a appPrefManager, FragmentActivity activity, WalkThroughType walkThroughType, WalkThroughView.b bVar, WalkThroughView.c cVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.j(appPrefManager, "appPrefManager");
        Intrinsics.j(activity, "activity");
        Intrinsics.j(walkThroughType, "walkThroughType");
        this.appPrefManager = appPrefManager;
        this.activity = activity;
        this.walkThroughType = walkThroughType;
        this.onDismissWalkThroughListener = bVar;
        this.onSwipeWalkThroughListener = cVar;
        this.forceShow = z10;
        this.fromSectionWalkThrough = z11;
        this.cancelable = z12;
        this.canDismissViaBackground = z13;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WalkThroughType.values().length];
            try {
                iArr[WalkThroughType.MAIN_APP_FIRST_LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalkThroughType.MCARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean a() {
        C18335a c18335a = this.appPrefManager;
        String strB = this.walkThroughType.getTutorialEnum().b();
        Intrinsics.i(strB, "getValue(...)");
        return !c18335a.o(strB) || this.forceShow;
    }

    private final boolean c() {
        WalkThroughView walkThroughViewA;
        boolean zA = a();
        if (zA) {
            int i10 = d.$EnumSwitchMapping$0[this.walkThroughType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    walkThroughViewA = WalkThroughView.INSTANCE.b(this.walkThroughType, this.forceShow, this.fromSectionWalkThrough, this.cancelable, this.canDismissViaBackground);
                } else {
                    walkThroughViewA = MperksCreditCardWalkThroughView.INSTANCE.a(this.walkThroughType, this.forceShow, this.fromSectionWalkThrough, this.cancelable, this.canDismissViaBackground);
                }
            } else {
                walkThroughViewA = AppWalkThroughView.INSTANCE.a(this.walkThroughType, this.forceShow, this.fromSectionWalkThrough);
            }
            walkThroughViewA.j1(this.onDismissWalkThroughListener);
            walkThroughViewA.l1(this.onSwipeWalkThroughListener);
            C18188a.f170828a.a(walkThroughViewA, this.activity, WalkThroughView.f120503p);
        }
        return zA;
    }

    public final boolean b() {
        return c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public X(a builder) {
        Intrinsics.j(builder, "builder");
        WalkThroughType walkThroughType = builder.getWalkThroughType();
        FragmentActivity activity = builder.getActivity();
        WalkThroughView.b onDismissWalkThroughListener = builder.getOnDismissWalkThroughListener();
        WalkThroughView.c onSwipeWalkThroughListener = builder.getOnSwipeWalkThroughListener();
        boolean forceShow = builder.getForceShow();
        boolean cancelable = builder.getCancelable();
        this(builder.getEntryPoint().i(), activity, walkThroughType, onDismissWalkThroughListener, onSwipeWalkThroughListener, forceShow, builder.getFromSectionWalkThrough(), cancelable, builder.getCanDismissViaBackground());
    }
}
