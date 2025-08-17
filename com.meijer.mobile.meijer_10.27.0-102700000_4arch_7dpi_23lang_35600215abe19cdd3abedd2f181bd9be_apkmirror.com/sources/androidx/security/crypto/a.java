package androidx.security.crypto;

import Ie.InterfaceC3727a;
import Ie.InterfaceC3732f;
import Ie.m;
import Ie.n;
import Ie.p;
import Je.C3781a;
import Oe.f;
import Qe.a;
import Z.C5504b;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f58662a;

    /* renamed from: b, reason: collision with root package name */
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f58663b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    final String f58664c;

    /* renamed from: d, reason: collision with root package name */
    final String f58665d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC3727a f58666e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC3732f f58667f;

    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        private final a f58669a;

        /* renamed from: b, reason: collision with root package name */
        private final SharedPreferences.Editor f58670b;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f58672d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private final List<String> f58671c = new CopyOnWriteArrayList();

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(c.BOOLEAN.e());
            byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        private void a() {
            if (this.f58672d.getAndSet(false)) {
                for (String str : this.f58669a.getAll().keySet()) {
                    if (!this.f58671c.contains(str) && !this.f58669a.g(str)) {
                        this.f58670b.remove(this.f58669a.d(str));
                    }
                }
            }
        }

        private void b() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f58669a.f58663b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator<String> it2 = this.f58671c.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(this.f58669a, it2.next());
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (this.f58669a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f58671c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair<String, String> pairE = this.f58669a.e(str, bArr);
                this.f58670b.putString((String) pairE.first, (String) pairE.second);
            } catch (GeneralSecurityException e10) {
                throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f58672d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.FLOAT.e());
            byteBufferAllocate.putFloat(f10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.INT.e());
            byteBufferAllocate.putInt(i10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(c.LONG.e());
            byteBufferAllocate.putLong(j10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(c.STRING.e());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new C5504b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(c.STRING_SET.e());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f58669a.g(str)) {
                this.f58670b.remove(this.f58669a.d(str));
                this.f58671c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }

        b(a aVar, SharedPreferences.Editor editor) {
            this.f58669a = aVar;
            this.f58670b = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f58670b.apply();
            b();
            this.f58671c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f58670b.commit();
            } finally {
                b();
                this.f58671c.clear();
            }
        }
    }

    private enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f58680a;

        public static c b(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return STRING_SET;
            }
            if (i10 == 2) {
                return INT;
            }
            if (i10 == 3) {
                return LONG;
            }
            if (i10 == 4) {
                return FLOAT;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int e() {
            return this.f58680a;
        }

        c(int i10) {
            this.f58680a = i10;
        }
    }

    public enum d {
        AES256_SIV("AES256_SIV");


        /* renamed from: a, reason: collision with root package name */
        private final String f58683a;

        m b() throws GeneralSecurityException {
            return n.a(this.f58683a);
        }

        d(String str) {
            this.f58683a = str;
        }
    }

    public enum e {
        AES256_GCM("AES256_GCM");


        /* renamed from: a, reason: collision with root package name */
        private final String f58686a;

        m b() throws GeneralSecurityException {
            return n.a(this.f58686a);
        }

        e(String str) {
            this.f58686a = str;
        }
    }

    /* renamed from: androidx.security.crypto.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1149a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58668a;

        static {
            int[] iArr = new int[c.values().length];
            f58668a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58668a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58668a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58668a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58668a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58668a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    String c(String str) {
        try {
            String str2 = new String(this.f58667f.b(Ve.e.a(str, 0), this.f58664c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return Ve.e.d(this.f58667f.a(str.getBytes(StandardCharsets.UTF_8), this.f58664c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f58662a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f58662a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String strC = c(entry.getKey());
                map.put(strC, f(strC));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f58663b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f58663b.remove(onSharedPreferenceChangeListener);
    }

    a(String str, String str2, SharedPreferences sharedPreferences, InterfaceC3727a interfaceC3727a, InterfaceC3732f interfaceC3732f) {
        this.f58664c = str;
        this.f58662a = sharedPreferences;
        this.f58665d = str2;
        this.f58666e = interfaceC3727a;
        this.f58667f = interfaceC3732f;
    }

    public static SharedPreferences a(Context context, String str, androidx.security.crypto.c cVar, d dVar, e eVar) throws GeneralSecurityException, IOException {
        return b(str, cVar.a(), context, dVar, eVar);
    }

    @Deprecated
    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) throws GeneralSecurityException, IOException {
        f.b();
        C3781a.c();
        Context applicationContext = context.getApplicationContext();
        p pVarE = new a.b().l(dVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().e();
        p pVarE2 = new a.b().l(eVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().e();
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (InterfaceC3727a) pVarE2.v(InterfaceC3727a.class), (InterfaceC3732f) pVarE.v(InterfaceC3732f.class));
    }

    private Object f(String str) throws SecurityException {
        if (!g(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String strD = d(str);
                String string = this.f58662a.getString(strD, null);
                if (string == null) {
                    return null;
                }
                boolean z10 = false;
                byte[] bArrA = Ve.e.a(string, 0);
                InterfaceC3727a interfaceC3727a = this.f58666e;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC3727a.b(bArrA, strD.getBytes(charset)));
                byteBufferWrap.position(0);
                int i10 = byteBufferWrap.getInt();
                c cVarB = c.b(i10);
                if (cVarB != null) {
                    switch (C1149a.f58668a[cVarB.ordinal()]) {
                        case 1:
                            int i11 = byteBufferWrap.getInt();
                            ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                            byteBufferWrap.limit(i11);
                            String string2 = charset.decode(byteBufferSlice).toString();
                            if (string2.equals("__NULL__")) {
                                return null;
                            }
                            return string2;
                        case 2:
                            return Integer.valueOf(byteBufferWrap.getInt());
                        case 3:
                            return Long.valueOf(byteBufferWrap.getLong());
                        case 4:
                            return Float.valueOf(byteBufferWrap.getFloat());
                        case 5:
                            if (byteBufferWrap.get() != 0) {
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                        case 6:
                            C5504b c5504b = new C5504b();
                            while (byteBufferWrap.hasRemaining()) {
                                int i12 = byteBufferWrap.getInt();
                                ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                                byteBufferSlice2.limit(i12);
                                byteBufferWrap.position(byteBufferWrap.position() + i12);
                                c5504b.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                            }
                            if (c5504b.size() == 1 && "__NULL__".equals(c5504b.s(0))) {
                                return null;
                            }
                            return c5504b;
                        default:
                            throw new SecurityException("Unhandled type for encrypted pref value: " + cVarB);
                    }
                }
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
            } catch (GeneralSecurityException e10) {
                throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
            }
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f58662a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    Pair<String, String> e(String str, byte[] bArr) throws GeneralSecurityException {
        String strD = d(str);
        return new Pair<>(strD, Ve.e.d(this.f58666e.a(bArr, strD.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) throws SecurityException {
        Object objF = f(str);
        if (objF instanceof Boolean) {
            return ((Boolean) objF).booleanValue();
        }
        return z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) throws SecurityException {
        Object objF = f(str);
        if (objF instanceof Float) {
            return ((Float) objF).floatValue();
        }
        return f10;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) throws SecurityException {
        Object objF = f(str);
        if (objF instanceof Integer) {
            return ((Integer) objF).intValue();
        }
        return i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) throws SecurityException {
        Object objF = f(str);
        if (objF instanceof Long) {
            return ((Long) objF).longValue();
        }
        return j10;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) throws SecurityException {
        Object objF = f(str);
        if (objF instanceof String) {
            return (String) objF;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) throws SecurityException {
        Set<String> c5504b;
        Object objF = f(str);
        if (objF instanceof Set) {
            c5504b = (Set) objF;
        } else {
            c5504b = new C5504b<>();
        }
        if (c5504b.size() > 0) {
            return c5504b;
        }
        return set;
    }
}
