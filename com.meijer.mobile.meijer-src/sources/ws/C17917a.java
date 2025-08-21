package ws;

import androidx.compose.ui.text.AnnotatedString;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import z1.InterfaceC18417E;
import z1.TransformedText;
import z1.W;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lws/a;", "Lz1/W;", "Ljava/text/NumberFormat;", "currencyFormat", "", "decimalCount", "<init>", "(Ljava/text/NumberFormat;I)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Lz1/U;", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Lz1/U;", "Ljava/text/NumberFormat;", "b", "I", "rateandtip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ws.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17917a implements W {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NumberFormat currencyFormat;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int decimalCount;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lws/a$a;", "Lz1/E;", "", "unmaskedTextLength", "maskedTextLength", "<init>", "(II)V", "offset", "b", "(I)I", "a", "I", "c", "rateandtip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ws.a$a, reason: collision with other inner class name */
    private static final class C2671a implements InterfaceC18417E {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int unmaskedTextLength;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int maskedTextLength;

        @Override // z1.InterfaceC18417E
        public int a(int offset) {
            return this.unmaskedTextLength;
        }

        @Override // z1.InterfaceC18417E
        public int b(int offset) {
            return this.maskedTextLength;
        }

        public C2671a(int i10, int i11) {
            this.unmaskedTextLength = i10;
            this.maskedTextLength = i11;
        }
    }

    public C17917a(NumberFormat currencyFormat, int i10) {
        Intrinsics.j(currencyFormat, "currencyFormat");
        this.currencyFormat = currencyFormat;
        this.decimalCount = i10;
    }

    @Override // z1.W
    public TransformedText a(AnnotatedString text) {
        Intrinsics.j(text, "text");
        NumberFormat numberFormat = this.currencyFormat;
        String text2 = text.getText();
        if (text2.length() == 0) {
            text2 = "0";
        }
        String str = numberFormat.format(Long.parseLong(text2) / Math.pow(10.0d, this.decimalCount));
        Intrinsics.g(str);
        AnnotatedString annotatedString = new AnnotatedString(str, text.h(), text.f());
        return new TransformedText(annotatedString, new C2671a(text.getText().length(), annotatedString.getText().length()));
    }

    public /* synthetic */ C17917a(NumberFormat numberFormat, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? NumberFormat.getCurrencyInstance(Locale.US) : numberFormat, (i11 & 2) != 0 ? 2 : i10);
    }
}
