package b7;

import android.text.TextUtils;
import com.google.maps.internal.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<j>> f59989c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f59990d;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f59991d;

        /* renamed from: e, reason: collision with root package name */
        private static final Map<String, List<j>> f59992e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f59993a = true;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, List<j>> f59994b = f59992e;

        /* renamed from: c, reason: collision with root package name */
        private boolean f59995c = true;

        public k a() {
            this.f59993a = true;
            return new k(this.f59994b);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        static {
            String strB = b();
            f59991d = strB;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strB)) {
                map.put(HttpHeaders.USER_AGENT, Collections.singletonList(new b(strB)));
            }
            f59992e = Collections.unmodifiableMap(map);
        }
    }

    static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        private final String f59996a;

        @Override // b7.j
        public String a() {
            return this.f59996a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f59996a.equals(((b) obj).f59996a);
            }
            return false;
        }

        public int hashCode() {
            return this.f59996a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f59996a + "'}";
        }

        b(String str) {
            this.f59996a = str;
        }
    }

    private String b(List<j> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = list.get(i10).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map<String, String> c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f59989c.entrySet()) {
            String strB = b(entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put(entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // b7.i
    public Map<String, String> a() {
        if (this.f59990d == null) {
            synchronized (this) {
                try {
                    if (this.f59990d == null) {
                        this.f59990d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f59990d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f59989c.equals(((k) obj).f59989c);
        }
        return false;
    }

    public int hashCode() {
        return this.f59989c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f59989c + '}';
    }

    k(Map<String, List<j>> map) {
        this.f59989c = Collections.unmodifiableMap(map);
    }
}
