package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/b;", "Landroidx/compose/ui/platform/a;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "", "i", "", "text", "e", "(Ljava/lang/String;)V", "", "current", "", "a", "(I)[I", "b", "Ljava/text/BreakIterator;", "c", "Ljava/text/BreakIterator;", "impl", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5838b extends AbstractC5835a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f52005e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static C5838b f52006f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BreakIterator impl;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/b$a;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/b;", "a", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/b;", "instance", "Landroidx/compose/ui/platform/b;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C5838b a(Locale locale) {
            if (C5838b.f52006f == null) {
                C5838b.f52006f = new C5838b(locale, null);
            }
            C5838b c5838b = C5838b.f52006f;
            Intrinsics.h(c5838b, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return c5838b;
        }
    }

    public /* synthetic */ C5838b(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private C5838b(Locale locale) {
        i(locale);
    }

    private final void i(Locale locale) {
        this.impl = BreakIterator.getCharacterInstance(locale);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5850f
    public int[] a(int current) {
        int length = d().length();
        if (length <= 0 || current >= length) {
            return null;
        }
        if (current < 0) {
            current = 0;
        }
        do {
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                Intrinsics.y("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(current)) {
                BreakIterator breakIterator2 = this.impl;
                if (breakIterator2 == null) {
                    Intrinsics.y("impl");
                    breakIterator2 = null;
                }
                current = breakIterator2.following(current);
            } else {
                BreakIterator breakIterator3 = this.impl;
                if (breakIterator3 == null) {
                    Intrinsics.y("impl");
                    breakIterator3 = null;
                }
                int iFollowing = breakIterator3.following(current);
                if (iFollowing == -1) {
                    return null;
                }
                return c(current, iFollowing);
            }
        } while (current != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.InterfaceC5850f
    public int[] b(int current) {
        int length = d().length();
        if (length <= 0 || current <= 0) {
            return null;
        }
        if (current > length) {
            current = length;
        }
        do {
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                Intrinsics.y("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(current)) {
                BreakIterator breakIterator2 = this.impl;
                if (breakIterator2 == null) {
                    Intrinsics.y("impl");
                    breakIterator2 = null;
                }
                current = breakIterator2.preceding(current);
            } else {
                BreakIterator breakIterator3 = this.impl;
                if (breakIterator3 == null) {
                    Intrinsics.y("impl");
                    breakIterator3 = null;
                }
                int iPreceding = breakIterator3.preceding(current);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, current);
            }
        } while (current != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractC5835a
    public void e(String text) {
        super.e(text);
        BreakIterator breakIterator = this.impl;
        if (breakIterator == null) {
            Intrinsics.y("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
    }
}
