package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class EnumC6056c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6056c f52662a = new EnumC6056c("Paragraph", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6056c f52663b = new EnumC6056c("Span", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6056c f52664c = new EnumC6056c("VerbatimTts", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6056c f52665d = new EnumC6056c("Url", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6056c f52666e = new EnumC6056c("Link", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6056c f52667f = new EnumC6056c("Clickable", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC6056c f52668g = new EnumC6056c("String", 6);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumC6056c[] f52669h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f52670i;

    private static final /* synthetic */ EnumC6056c[] a() {
        return new EnumC6056c[]{f52662a, f52663b, f52664c, f52665d, f52666e, f52667f, f52668g};
    }

    public static EnumC6056c valueOf(String str) {
        return (EnumC6056c) Enum.valueOf(EnumC6056c.class, str);
    }

    public static EnumC6056c[] values() {
        return (EnumC6056c[]) f52669h.clone();
    }

    static {
        EnumC6056c[] enumC6056cArrA = a();
        f52669h = enumC6056cArrA;
        f52670i = EnumEntriesKt.a(enumC6056cArrA);
    }

    private EnumC6056c(String str, int i10) {
    }
}
