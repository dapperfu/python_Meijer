package Ds;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BulletSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a7\u0010\t\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/text/SpannableStringBuilder;", "", "", "paragraphs", "", "putVerticalSpaceBeforeFirstParagraph", "", "verticalSpaceToPutBetweenParagraphs", "horizontalSpaceToPutBetweenBulletPointAndParagraph", "b", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/String;ZII)Landroid/text/SpannableStringBuilder;", "paragraph", "verticalSpaceToPutBeforeParagraph", "a", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;II)Landroid/text/SpannableStringBuilder;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {
    public static final SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, String paragraph, int i10, int i11) {
        Intrinsics.j(spannableStringBuilder, "<this>");
        Intrinsics.j(paragraph, "paragraph");
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(i10);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append("\n\n");
        spannableStringBuilder.setSpan(absoluteSizeSpan, length, spannableStringBuilder.length(), 17);
        BulletSpan bulletSpan = new BulletSpan(i11);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) paragraph);
        spannableStringBuilder.setSpan(bulletSpan, length2, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder b(SpannableStringBuilder spannableStringBuilder, String[] paragraphs, boolean z10, int i10, int i11) {
        Intrinsics.j(spannableStringBuilder, "<this>");
        Intrinsics.j(paragraphs, "paragraphs");
        int length = paragraphs.length;
        boolean z11 = true;
        int i12 = 0;
        while (i12 < length) {
            a(spannableStringBuilder, paragraphs[i12], (!z11 || z10) ? i10 : 0, i11);
            i12++;
            z11 = false;
        }
        return spannableStringBuilder;
    }
}
