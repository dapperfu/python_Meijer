package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import android.text.SpannableStringBuilder;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import z1.InterfaceC18354E;
import z1.TransformedText;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/a;", "Lz1/W;", "", "format", "", "separator", "<init>", "(Ljava/lang/String;C)V", "Landroidx/compose/ui/text/AnnotatedString;", "inputText", "Lz1/U;", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Lz1/U;", "Ljava/lang/String;", "b", "C", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12023a implements z1.W {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String format;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final char separator;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"com/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/a$a", "Lz1/E;", "", "offset", "b", "(I)I", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.a$a, reason: collision with other inner class name */
    public static final class C1572a implements InterfaceC18354E {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f105714b;

        @Override // z1.InterfaceC18354E
        public int b(int offset) {
            if (offset <= 2) {
                return offset;
            }
            if (offset <= 4) {
                return offset + 1;
            }
            if (offset <= 6) {
                return offset + 2;
            }
            return 8;
        }

        C1572a(String str) {
            this.f105714b = str;
        }

        @Override // z1.InterfaceC18354E
        public int a(int offset) {
            return offset > this.f105714b.length() ? this.f105714b.length() : offset;
        }
    }

    public C12023a(String format, char c10) {
        Intrinsics.j(format, "format");
        this.format = format;
        this.separator = c10;
    }

    @Override // z1.W
    public TransformedText a(AnnotatedString inputText) {
        Intrinsics.j(inputText, "inputText");
        int i10 = 0;
        String strG1 = inputText.getText().length() >= 6 ? StringsKt.g1(inputText.getText(), RangesKt.x(0, 6)) : inputText.getText();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strG1);
        int length = spannableStringBuilder.length();
        if (1 <= length && length < 6) {
            String strSubstring = this.format.substring(spannableStringBuilder.length());
            Intrinsics.i(strSubstring, "substring(...)");
            spannableStringBuilder.append((CharSequence) strSubstring);
        }
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        int i11 = 0;
        while (i10 < spannableStringBuilder.length()) {
            char cCharAt = spannableStringBuilder.charAt(i10);
            int i12 = i11 + 1;
            if (i11 == 1 || i11 == 3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cCharAt);
                sb2.append(this.separator);
                bVar.g(sb2.toString());
            } else {
                bVar.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return new TransformedText(bVar.q(), new C1572a(strG1));
    }
}
