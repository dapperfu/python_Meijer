package n2;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n2.c;
import o2.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f152013a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<a> f152014b = new Comparator() { // from class: n2.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return c.a((c.a) obj, (c.a) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        URLSpan f152015a;

        /* renamed from: b, reason: collision with root package name */
        String f152016b;

        /* renamed from: c, reason: collision with root package name */
        int f152017c;

        /* renamed from: d, reason: collision with root package name */
        int f152018d;

        a() {
        }
    }

    public static /* synthetic */ int a(a aVar, a aVar2) {
        int i10 = aVar.f152017c;
        int i11 = aVar2.f152017c;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        return Integer.compare(aVar2.f152018d, aVar.f152018d);
    }

    private static void e(String str, int i10, int i11, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i10, i11, 33);
    }

    private static String f(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : C15895a.c(str);
    }

    private static String i(String str, String[] strArr, Matcher matcher, Linkify.TransformFilter transformFilter) {
        boolean z10;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        String str2 = str;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            String str3 = strArr[i10];
            if (str2.regionMatches(true, 0, str3, 0, str3.length())) {
                z10 = true;
                if (!str2.regionMatches(false, 0, str3, 0, str3.length())) {
                    str2 = str3 + str2.substring(str3.length());
                }
            } else {
                i10++;
            }
        }
        if (z10 || strArr.length <= 0) {
            return str2;
        }
        return strArr[0] + str2;
    }

    private static boolean k() {
        return Build.VERSION.SDK_INT >= 28;
    }

    private static void b(TextView textView) {
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static boolean c(Spannable spannable, int i10) {
        Spannable spannable2;
        if (k()) {
            return Linkify.addLinks(spannable, i10);
        }
        if (i10 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i10 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            spannable2 = spannable;
            g(arrayList, spannable2, e.f153592h, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        } else {
            spannable2 = spannable;
        }
        if ((i10 & 2) != 0) {
            g(arrayList, spannable2, e.f153593i, new String[]{"mailto:"}, null, null);
        }
        if ((i10 & 8) != 0) {
            h(arrayList, spannable2);
        }
        j(arrayList, spannable2);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f152015a == null) {
                e(aVar.f152016b, aVar.f152017c, aVar.f152018d, spannable2);
            }
        }
        return true;
    }

    public static boolean d(TextView textView, int i10) {
        if (k()) {
            return Linkify.addLinks(textView, i10);
        }
        if (i10 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (c((Spannable) text, i10)) {
                b(textView);
                return true;
            }
        } else {
            SpannableString spannableStringValueOf = SpannableString.valueOf(text);
            if (c(spannableStringValueOf, i10)) {
                b(textView);
                textView.setText(spannableStringValueOf);
                return true;
            }
        }
        return false;
    }

    private static void g(ArrayList<a> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    a aVar = new a();
                    aVar.f152016b = i(strGroup, strArr, matcher, transformFilter);
                    aVar.f152017c = iStart;
                    aVar.f152018d = iEnd;
                    arrayList.add(aVar);
                }
            }
        }
    }

    private static void h(ArrayList<a> arrayList, Spannable spannable) {
        int iIndexOf;
        String string = spannable.toString();
        int i10 = 0;
        while (true) {
            try {
                String strF = f(string);
                if (strF != null && (iIndexOf = string.indexOf(strF)) >= 0) {
                    a aVar = new a();
                    int length = strF.length() + iIndexOf;
                    aVar.f152017c = iIndexOf + i10;
                    i10 += length;
                    aVar.f152018d = i10;
                    string = string.substring(length);
                    try {
                        aVar.f152016b = "geo:0,0?q=" + URLEncoder.encode(strF, "UTF-8");
                        arrayList.add(aVar);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    private static void j(ArrayList<a> arrayList, Spannable spannable) {
        int i10;
        int i11;
        int i12 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            a aVar = new a();
            aVar.f152015a = uRLSpan;
            aVar.f152017c = spannable.getSpanStart(uRLSpan);
            aVar.f152018d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(aVar);
        }
        Collections.sort(arrayList, f152014b);
        int size = arrayList.size();
        while (i12 < size - 1) {
            a aVar2 = arrayList.get(i12);
            int i13 = i12 + 1;
            a aVar3 = arrayList.get(i13);
            int i14 = aVar2.f152017c;
            int i15 = aVar3.f152017c;
            if (i14 <= i15 && (i10 = aVar2.f152018d) > i15) {
                int i16 = aVar3.f152018d;
                if (i16 <= i10 || i10 - i14 > i16 - i15) {
                    i11 = i13;
                } else if (i10 - i14 < i16 - i15) {
                    i11 = i12;
                } else {
                    i11 = -1;
                }
                if (i11 != -1) {
                    Object obj = arrayList.get(i11).f152015a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i11);
                    size--;
                }
            }
            i12 = i13;
        }
    }
}
