package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/i;", "Landroidx/compose/ui/platform/h;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "originalTimeoutMillis", "", "containsIcons", "containsText", "containsControls", "a", "(JZZZ)J", "Landroid/view/accessibility/AccessibilityManager;", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6001i implements InterfaceC5998h {

    /* renamed from: b, reason: collision with root package name */
    private static final a f52322b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f52323c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AccessibilityManager accessibilityManager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/i$a;", "", "<init>", "()V", "", "FlagContentControls", "I", "FlagContentIcons", "FlagContentText", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.i$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6001i(Context context) {
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.InterfaceC5998h
    public long a(long originalTimeoutMillis, boolean containsIcons, boolean containsText, boolean containsControls) {
        int i10 = containsIcons;
        if (originalTimeoutMillis < 2147483647L) {
            if (containsText) {
                i10 = (containsIcons ? 1 : 0) | 2;
            }
            if (containsControls) {
                i10 = (i10 == true ? 1 : 0) | 4;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                int iA = C5987d0.f52290a.a(this.accessibilityManager, (int) originalTimeoutMillis, i10);
                if (iA == Integer.MAX_VALUE) {
                    return Long.MAX_VALUE;
                }
                return iA;
            }
            if (containsControls && this.accessibilityManager.isTouchExplorationEnabled()) {
                return Long.MAX_VALUE;
            }
        }
        return originalTimeoutMillis;
    }
}
