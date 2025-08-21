package kotlin;

import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import kotlin.C14682w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\u00020\b2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R*\u0010,\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00048\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R.\u00103\u001a\u0004\u0018\u00010\r2\b\u0010&\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u00105\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001c¨\u00066"}, d2 = {"Li4/x;", "", "<init>", "()V", "", PreferencesHelper.PREF_ID, "Lkotlin/Function1;", "Li4/E;", "", "Lkotlin/ExtensionFunctionType;", "popUpToBuilder", "c", "(ILkotlin/jvm/functions/Function1;)V", "", PlaceTypes.ROUTE, "d", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Li4/b;", "animBuilder", "a", "(Lkotlin/jvm/functions/Function1;)V", "Li4/w;", "b", "()Li4/w;", "Li4/w$a;", "Li4/w$a;", "builder", "", "Z", "getLaunchSingleTop", "()Z", "f", "(Z)V", "launchSingleTop", "<set-?>", "getRestoreState", "i", "restoreState", "value", "I", "getPopUpToId", "()I", "g", "(I)V", "popUpToId", "e", "Ljava/lang/String;", "getPopUpToRoute", "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "popUpToRoute", "inclusive", "saveState", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14683x {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean launchSingleTop;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean restoreState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String popUpToRoute;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean inclusive;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean saveState;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14682w.a builder = new C14682w.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int popUpToId = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/E;", "", "a", "(Li4/E;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.x$a */
    public static final class a extends Lambda implements Function1<C14659E, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f137204f = new a();

        a() {
            super(1);
        }

        public final void a(C14659E c14659e) {
            Intrinsics.j(c14659e, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C14659E c14659e) {
            a(c14659e);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(C14683x c14683x, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = a.f137204f;
        }
        c14683x.d(str, function1);
    }

    private final void h(String str) {
        if (str != null) {
            if (StringsKt.s0(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    public final void a(Function1<? super C14661b, Unit> animBuilder) {
        Intrinsics.j(animBuilder, "animBuilder");
        C14661b c14661b = new C14661b();
        animBuilder.invoke(c14661b);
        this.builder.b(c14661b.getEnter()).c(c14661b.getExit()).e(c14661b.getPopEnter()).f(c14661b.getPopExit());
    }

    public final C14682w b() {
        C14682w.a aVar = this.builder;
        aVar.d(this.launchSingleTop);
        aVar.j(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            aVar.h(str, this.inclusive, this.saveState);
        } else {
            aVar.g(this.popUpToId, this.inclusive, this.saveState);
        }
        return aVar.a();
    }

    public final void c(int id2, Function1<? super C14659E, Unit> popUpToBuilder) {
        Intrinsics.j(popUpToBuilder, "popUpToBuilder");
        g(id2);
        h(null);
        C14659E c14659e = new C14659E();
        popUpToBuilder.invoke(c14659e);
        this.inclusive = c14659e.getInclusive();
        this.saveState = c14659e.getSaveState();
    }

    public final void d(String route, Function1<? super C14659E, Unit> popUpToBuilder) {
        Intrinsics.j(route, "route");
        Intrinsics.j(popUpToBuilder, "popUpToBuilder");
        h(route);
        g(-1);
        C14659E c14659e = new C14659E();
        popUpToBuilder.invoke(c14659e);
        this.inclusive = c14659e.getInclusive();
        this.saveState = c14659e.getSaveState();
    }

    public final void f(boolean z10) {
        this.launchSingleTop = z10;
    }

    public final void g(int i10) {
        this.popUpToId = i10;
        this.inclusive = false;
    }

    public final void i(boolean z10) {
        this.restoreState = z10;
    }
}
