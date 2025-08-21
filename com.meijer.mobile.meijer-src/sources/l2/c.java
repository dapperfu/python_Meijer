package l2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0004\n\r\u0007\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Ll2/c;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "b", "()V", "Ll2/c$c;", "a", "Ll2/c$c;", "impl", "c", "d", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C2290c impl;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll2/c$a;", "", "<init>", "()V", "Landroid/app/Activity;", "Ll2/c;", "a", "(Landroid/app/Activity;)Ll2/c;", "", "MASK_FACTOR", "F", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: l2.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final c a(Activity activity) {
            Intrinsics.j(activity, "<this>");
            c cVar = new c(activity, null);
            cVar.b();
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ll2/c$b;", "Ll2/c$c;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/window/SplashScreenView;", "child", "", "d", "(Landroid/window/SplashScreenView;)Z", "", "b", "()V", "h", "Z", "getMDecorFitWindowInsets", "()Z", "e", "(Z)V", "mDecorFitWindowInsets", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "i", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getHierarchyListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "hierarchyListener", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class b extends C2290c {

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean mDecorFitWindowInsets;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final ViewGroup.OnHierarchyChangeListener hierarchyListener;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"l2/c$b$a", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "parent", "child", "", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", "onChildViewRemoved", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f149187b;

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View parent, View child) {
            }

            a(Activity activity) {
                this.f149187b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View parent, View child) {
                if (h.a(child)) {
                    b bVar = b.this;
                    bVar.e(bVar.d(i.a(child)));
                    ((ViewGroup) this.f149187b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(activity);
            Intrinsics.j(activity, "activity");
            this.mDecorFitWindowInsets = true;
            this.hierarchyListener = new a(activity);
        }

        public final boolean d(SplashScreenView child) {
            Intrinsics.j(child, "child");
            WindowInsets windowInsetsBuild = e.a().build();
            Intrinsics.i(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final void e(boolean z10) {
            this.mDecorFitWindowInsets = z10;
        }

        @Override // l2.c.C2290c
        public void b() {
            Resources.Theme theme = getActivity().getTheme();
            Intrinsics.i(theme, "activity.theme");
            c(theme, new TypedValue());
            ((ViewGroup) getActivity().getWindow().getDecorView()).setOnHierarchyChangeListener(this.hierarchyListener);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Ll2/c$c;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "b", "()V", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "currentTheme", "Landroid/util/TypedValue;", "typedValue", "c", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V", "a", "Landroid/app/Activity;", "()Landroid/app/Activity;", "", "I", "getFinalThemeId", "()I", "setFinalThemeId", "(I)V", "finalThemeId", "Ljava/lang/Integer;", "getBackgroundResId", "()Ljava/lang/Integer;", "setBackgroundResId", "(Ljava/lang/Integer;)V", "backgroundResId", "d", "getBackgroundColor", "setBackgroundColor", "backgroundColor", "Landroid/graphics/drawable/Drawable;", "e", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", BarcodePickDeserializer.FIELD_ICON, "", "f", "Z", "getHasBackground", "()Z", "setHasBackground", "(Z)V", "hasBackground", "Ll2/c$d;", "g", "Ll2/c$d;", "getSplashScreenWaitPredicate", "()Ll2/c$d;", "setSplashScreenWaitPredicate", "(Ll2/c$d;)V", "splashScreenWaitPredicate", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: l2.c$c, reason: collision with other inner class name */
    private static class C2290c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Activity activity;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int finalThemeId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Integer backgroundResId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Integer backgroundColor;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Drawable icon;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean hasBackground;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private d splashScreenWaitPredicate;

        /* JADX WARN: Multi-variable type inference failed */
        public static Drawable __fsTypeCheck_fd91eff810b5be82e24b662149d91569(Resources.Theme theme, int i10) {
            return theme instanceof Context ? FS.Resources_getDrawable((Context) theme, i10) : theme instanceof Resources ? FS.Resources_getDrawable((Resources) theme, i10) : theme.getDrawable(i10);
        }

        public C2290c(Activity activity) {
            Intrinsics.j(activity, "activity");
            this.activity = activity;
            this.splashScreenWaitPredicate = new d() { // from class: l2.d
            };
        }

        /* renamed from: a, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        public void b() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.activity.getTheme();
            if (currentTheme.resolveAttribute(C15445a.f149180d, typedValue, true)) {
                this.backgroundResId = Integer.valueOf(typedValue.resourceId);
                this.backgroundColor = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(C15445a.f149179c, typedValue, true)) {
                this.icon = __fsTypeCheck_fd91eff810b5be82e24b662149d91569(currentTheme, typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(C15445a.f149178b, typedValue, true)) {
                this.hasBackground = typedValue.resourceId == C15446b.f149181a;
            }
            Intrinsics.i(currentTheme, "currentTheme");
            c(currentTheme, typedValue);
        }

        protected final void c(Resources.Theme currentTheme, TypedValue typedValue) {
            Intrinsics.j(currentTheme, "currentTheme");
            Intrinsics.j(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(C15445a.f149177a, typedValue, true)) {
                int i10 = typedValue.resourceId;
                this.finalThemeId = i10;
                if (i10 != 0) {
                    this.activity.setTheme(i10);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll2/c$d;", "", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface d {
    }

    public /* synthetic */ c(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    private c(Activity activity) {
        this.impl = Build.VERSION.SDK_INT >= 31 ? new b(activity) : new C2290c(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.impl.b();
    }
}
