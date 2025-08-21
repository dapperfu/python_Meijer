package xb;

import com.gimbal.internal.json.JsonReadException;
import com.gimbal.internal.json.JsonWriteException;
import com.google.maps.android.BuildConfig;
import eb.C13784a;
import eb.C13785b;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: xb.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18150d {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f170668c = C13785b.a(C18150d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final C18152f f170669a;

    /* renamed from: b, reason: collision with root package name */
    private final C18153g f170670b;

    public C18150d() {
        this(true);
    }

    private C18150d(boolean z10) {
        this.f170669a = new C18152f(z10);
        this.f170670b = new C18153g(z10);
    }

    public static String e(Object obj, int i10) {
        if (obj == null) {
            return BuildConfig.TRAVIS;
        }
        try {
            C18150d c18150d = new C18150d(false);
            if (!obj.getClass().isArray() && !(obj instanceof Collection)) {
                if (!(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Enum)) {
                    JSONObject jSONObjectG = c18150d.g(obj);
                    return i10 > 0 ? jSONObjectG.toString(i10) : jSONObjectG.toString();
                }
                return c18150d.h(obj);
            }
            JSONArray jSONArrayF = c18150d.f(obj);
            return i10 > 0 ? jSONArrayF.toString(i10) : jSONArrayF.toString();
        } catch (Exception e10) {
            e10.getMessage();
            return "-- toString() Failed --  " + obj.getClass().getName();
        }
    }

    public void a(C18147a c18147a, Class<?>... clsArr) {
        this.f170669a.d(c18147a, clsArr);
        this.f170670b.d(c18147a, clsArr);
    }

    public void b(AbstractC18155i abstractC18155i, Class<?>... clsArr) {
        this.f170669a.e(abstractC18155i, clsArr);
        this.f170670b.e(abstractC18155i, clsArr);
    }

    public <X> X c(Class<X> cls, String str) throws JsonReadException {
        return (X) this.f170669a.w(cls, str);
    }

    public <X> X d(Class<X> cls, byte[] bArr) throws JsonReadException {
        return (X) this.f170669a.w(cls, new String(bArr));
    }

    public JSONArray f(Object obj) throws JsonWriteException {
        return this.f170670b.l(obj);
    }

    public JSONObject g(Object obj) throws JsonWriteException {
        return this.f170670b.m(obj);
    }

    public String h(Object obj) throws JsonWriteException {
        return this.f170670b.n(obj);
    }
}
