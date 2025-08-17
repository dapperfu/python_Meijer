package Xe;

import Ze.a;
import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f39297g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    static final DateFormat f39298h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    private final String f39299a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39300b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39301c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f39302d;

    /* renamed from: e, reason: collision with root package name */
    private final long f39303e;

    /* renamed from: f, reason: collision with root package name */
    private final long f39304f;

    static a a(a.c cVar) {
        String str = cVar.f42629d;
        if (str == null) {
            str = "";
        }
        return new a(cVar.f42627b, String.valueOf(cVar.f42628c), str, new Date(cVar.f42638m), cVar.f42630e, cVar.f42635j);
    }

    static a b(Map<String, String> map) throws AbtException, NumberFormatException, ParseException {
        g(map);
        try {
            return new a(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f39298h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    private static void g(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f39297g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String c() {
        return this.f39299a;
    }

    long d() {
        return this.f39302d.getTime();
    }

    String e() {
        return this.f39300b;
    }

    a.c f(String str) {
        a.c cVar = new a.c();
        cVar.f42626a = str;
        cVar.f42638m = d();
        cVar.f42627b = this.f39299a;
        cVar.f42628c = this.f39300b;
        cVar.f42629d = TextUtils.isEmpty(this.f39301c) ? null : this.f39301c;
        cVar.f42630e = this.f39303e;
        cVar.f42635j = this.f39304f;
        return cVar;
    }

    public a(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f39299a = str;
        this.f39300b = str2;
        this.f39301c = str3;
        this.f39302d = date;
        this.f39303e = j10;
        this.f39304f = j11;
    }
}
