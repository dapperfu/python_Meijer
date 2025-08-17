package androidx.view;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/activity/L;", "", "", "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "<init>", "(IIILkotlin/jvm/functions/Function1;)V", "isDark", "d", "(Z)I", "e", "a", "I", "b", "()I", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int lightScrim;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int darkScrim;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int nightMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1<Resources, Boolean> detectDarkMode;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/activity/L$a;", "", "<init>", "()V", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "Landroidx/activity/L;", "a", "(IILkotlin/jvm/functions/Function1;)Landroidx/activity/L;", "scrim", "c", "(I)Landroidx/activity/L;", "d", "(II)Landroidx/activity/L;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.activity.L$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Resources;", "resources", "", "a", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.activity.L$a$a, reason: collision with other inner class name */
        static final class C0953a extends Lambda implements Function1<Resources, Boolean> {

            /* renamed from: f, reason: collision with root package name */
            public static final C0953a f45699f = new C0953a();

            C0953a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                Intrinsics.j(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Resources;", "<anonymous parameter 0>", "", "a", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.activity.L$a$b */
        static final class b extends Lambda implements Function1<Resources, Boolean> {

            /* renamed from: f, reason: collision with root package name */
            public static final b f45700f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                Intrinsics.j(resources, "<anonymous parameter 0>");
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Resources;", "<anonymous parameter 0>", "", "a", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.activity.L$a$c */
        static final class c extends Lambda implements Function1<Resources, Boolean> {

            /* renamed from: f, reason: collision with root package name */
            public static final c f45701f = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                Intrinsics.j(resources, "<anonymous parameter 0>");
                return Boolean.FALSE;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ L b(Companion companion, int i10, int i11, Function1 function1, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                function1 = C0953a.f45699f;
            }
            return companion.a(i10, i11, function1);
        }

        @JvmStatic
        @JvmOverloads
        public final L a(int lightScrim, int darkScrim, Function1<? super Resources, Boolean> detectDarkMode) {
            Intrinsics.j(detectDarkMode, "detectDarkMode");
            return new L(lightScrim, darkScrim, 0, detectDarkMode, null);
        }

        @JvmStatic
        public final L c(int scrim) {
            return new L(scrim, scrim, 2, b.f45700f, null);
        }

        @JvmStatic
        public final L d(int scrim, int darkScrim) {
            return new L(scrim, darkScrim, 1, c.f45701f, null);
        }
    }

    public /* synthetic */ L(int i10, int i11, int i12, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L(int i10, int i11, int i12, Function1<? super Resources, Boolean> function1) {
        this.lightScrim = i10;
        this.darkScrim = i11;
        this.nightMode = i12;
        this.detectDarkMode = function1;
    }

    /* renamed from: a, reason: from getter */
    public final int getDarkScrim() {
        return this.darkScrim;
    }

    public final Function1<Resources, Boolean> b() {
        return this.detectDarkMode;
    }

    /* renamed from: c, reason: from getter */
    public final int getNightMode() {
        return this.nightMode;
    }

    public final int d(boolean isDark) {
        return isDark ? this.darkScrim : this.lightScrim;
    }

    public final int e(boolean isDark) {
        if (this.nightMode == 0) {
            return 0;
        }
        return isDark ? this.darkScrim : this.lightScrim;
    }
}
