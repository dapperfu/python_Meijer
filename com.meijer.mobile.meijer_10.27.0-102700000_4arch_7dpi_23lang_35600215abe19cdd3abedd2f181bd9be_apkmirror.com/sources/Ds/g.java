package Ds;

import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f7337a = Pattern.compile("^(1[. -])?(\\(\\d{3}\\) ?|\\d{3}[. -]?)\\d{3}[- .]?\\d{4}$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f7338b = Pattern.compile("^(1[. -])?(\\([2-9]\\d{2}\\) ?|[2-9]\\d{2}[. -]?)\\d{3}[- .]?\\d{4}$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f7339c = Pattern.compile("^(1[. -])?(\\([2-9]\\d{2}\\) ?|[2-9]\\d{2}[. -]?)[2-9]\\d{2}[- .]?\\d{4}$");

    /* renamed from: d, reason: collision with root package name */
    private static int f7340d = 10;

    public static CharSequence a(CharSequence charSequence) {
        return b(charSequence, false);
    }

    public static CharSequence f(CharSequence charSequence) {
        int length = charSequence != null ? charSequence.length() : 0;
        if (length == 0) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (PhoneNumberUtils.isNonSeparator(cCharAt)) {
                spannableStringBuilder.append(cCharAt);
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence b(CharSequence charSequence, boolean z10) {
        if (charSequence == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequenceF = f(charSequence);
        int length = charSequenceF.length();
        int i10 = f7340d;
        if (length > i10) {
            charSequenceF = charSequenceF.subSequence(0, i10);
            length = f7340d;
        }
        if (length > 3 && length <= 7) {
            spannableStringBuilder.append(charSequenceF, 0, 3).append('-').append(charSequenceF, 3, length);
            return spannableStringBuilder;
        }
        if (length <= 7) {
            spannableStringBuilder.append(charSequenceF, 0, length);
            return spannableStringBuilder;
        }
        if (z10) {
            spannableStringBuilder.append(charSequenceF, 0, 3).append('-').append(charSequenceF, 3, 6).append('-').append(charSequenceF, 6, length);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append('(').append(charSequenceF, 0, 3).append(')').append(' ').append(charSequenceF, 3, 6).append('-').append(charSequenceF, 6, length);
        return spannableStringBuilder;
    }

    public static String c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        CharSequence charSequenceF = f(charSequence);
        int length = charSequenceF.length();
        return (length <= f7340d || charSequenceF.charAt(0) != '1') ? charSequenceF.toString() : charSequenceF.subSequence(1, length).toString();
    }

    public static boolean d(CharSequence charSequence) {
        return charSequence != null && f7337a.matcher(charSequence).matches();
    }

    public static boolean e(String str) {
        return str != null && str.length() == f7340d;
    }
}
