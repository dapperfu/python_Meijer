package Ze;

import android.text.TextUtils;
import bf.InterfaceC6375a;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f43775g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    static final DateFormat f43776h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    private final String f43777a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43778b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43779c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f43780d;

    /* renamed from: e, reason: collision with root package name */
    private final long f43781e;

    /* renamed from: f, reason: collision with root package name */
    private final long f43782f;

    static a a(InterfaceC6375a.c cVar) {
        String str = cVar.f60296d;
        if (str == null) {
            str = "";
        }
        return new a(cVar.f60294b, String.valueOf(cVar.f60295c), str, new Date(cVar.f60305m), cVar.f60297e, cVar.f60302j);
    }

    static a b(Map<String, String> map) throws AbtException, NumberFormatException, ParseException {
        g(map);
        try {
            return new a(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f43776h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    private static void g(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f43775g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String c() {
        return this.f43777a;
    }

    long d() {
        return this.f43780d.getTime();
    }

    String e() {
        return this.f43778b;
    }

    InterfaceC6375a.c f(String str) {
        InterfaceC6375a.c cVar = new InterfaceC6375a.c();
        cVar.f60293a = str;
        cVar.f60305m = d();
        cVar.f60294b = this.f43777a;
        cVar.f60295c = this.f43778b;
        cVar.f60296d = TextUtils.isEmpty(this.f43779c) ? null : this.f43779c;
        cVar.f60297e = this.f43781e;
        cVar.f60302j = this.f43782f;
        return cVar;
    }

    public a(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f43777a = str;
        this.f43778b = str2;
        this.f43779c = str3;
        this.f43780d = date;
        this.f43781e = j10;
        this.f43782f = j11;
    }
}
