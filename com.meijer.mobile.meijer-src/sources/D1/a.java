package D1;

import B1.LocaleList;
import C1.i;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LD1/a;", "", "<init>", "()V", "LB1/e;", "localeList", "a", "(LB1/e;)Ljava/lang/Object;", "LC1/i;", "textPaint", "", "b", "(LC1/i;LB1/e;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5897a = new a();

    public final Object a(LocaleList localeList) {
        ArrayList arrayList = new ArrayList(CollectionsKt.x(localeList, 10));
        Iterator<B1.d> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(i textPaint, LocaleList localeList) {
        ArrayList arrayList = new ArrayList(CollectionsKt.x(localeList, 10));
        Iterator<B1.d> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        textPaint.setTextLocales(new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    private a() {
    }
}
