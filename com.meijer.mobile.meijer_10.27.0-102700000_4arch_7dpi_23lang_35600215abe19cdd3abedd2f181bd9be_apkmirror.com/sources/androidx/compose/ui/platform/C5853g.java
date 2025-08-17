package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/g;", "Landroidx/compose/ui/platform/a;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "", "l", "", "index", "", "k", "(I)Z", "i", "j", "", "text", "e", "(Ljava/lang/String;)V", "current", "", "a", "(I)[I", "b", "Ljava/text/BreakIterator;", "c", "Ljava/text/BreakIterator;", "impl", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5853g extends AbstractC5835a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f52081e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static C5853g f52082f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BreakIterator impl;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/g$a;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/g;", "a", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/g;", "instance", "Landroidx/compose/ui/platform/g;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C5853g a(Locale locale) {
            if (C5853g.f52082f == null) {
                C5853g.f52082f = new C5853g(locale, null);
            }
            C5853g c5853g = C5853g.f52082f;
            Intrinsics.h(c5853g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return c5853g;
        }
    }

    public /* synthetic */ C5853g(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private C5853g(Locale locale) {
        l(locale);
    }

    private final boolean i(int index) {
        if (index <= 0 || !j(index - 1)) {
            return false;
        }
        return index == d().length() || !j(index);
    }

    private final boolean j(int index) {
        if (index < 0 || index >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(index));
    }

    private final boolean k(int index) {
        if (j(index)) {
            if (index == 0 || !j(index - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final void l(Locale locale) {
        this.impl = BreakIterator.getWordInstance(locale);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5850f
    public int[] a(int current) {
        if (d().length() <= 0 || current >= d().length()) {
            return null;
        }
        if (current < 0) {
            current = 0;
        }
        while (!j(current) && !k(current)) {
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                Intrinsics.y("impl");
                breakIterator = null;
            }
            current = breakIterator.following(current);
            if (current == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.impl;
        if (breakIterator2 == null) {
            Intrinsics.y("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(current);
        if (iFollowing == -1 || !i(iFollowing)) {
            return null;
        }
        return c(current, iFollowing);
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
        while (current > 0 && !j(current - 1) && !i(current)) {
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                Intrinsics.y("impl");
                breakIterator = null;
            }
            current = breakIterator.preceding(current);
            if (current == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.impl;
        if (breakIterator2 == null) {
            Intrinsics.y("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(current);
        if (iPreceding == -1 || !k(iPreceding)) {
            return null;
        }
        return c(iPreceding, current);
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
