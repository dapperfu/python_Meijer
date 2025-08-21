package z4;

import Ke.InterfaceC3886a;
import Ke.InterfaceC3891f;
import Ke.m;
import Ke.n;
import Ke.p;
import Le.C4025a;
import Qe.f;
import Se.a;
import Z.C5604b;
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

@Deprecated
/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class SharedPreferencesC18442a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f172342a;

    /* renamed from: b, reason: collision with root package name */
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f172343b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    final String f172344c;

    /* renamed from: d, reason: collision with root package name */
    final String f172345d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC3886a f172346e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC3891f f172347f;

    /* renamed from: z4.a$a, reason: collision with other inner class name */
    private static final class SharedPreferencesEditorC2779a implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        private final SharedPreferencesC18442a f172348a;

        /* renamed from: b, reason: collision with root package name */
        private final SharedPreferences.Editor f172349b;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f172351d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private final List<String> f172350c = new CopyOnWriteArrayList();

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(b.BOOLEAN.e());
            byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        private void a() {
            if (this.f172351d.getAndSet(false)) {
                for (String str : this.f172348a.getAll().keySet()) {
                    if (!this.f172350c.contains(str) && !this.f172348a.g(str)) {
                        this.f172349b.remove(this.f172348a.d(str));
                    }
                }
            }
        }

        private void b() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f172348a.f172343b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator<String> it2 = this.f172350c.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(this.f172348a, it2.next());
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (this.f172348a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f172350c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair<String, String> pairE = this.f172348a.e(str, bArr);
                this.f172349b.putString((String) pairE.first, (String) pairE.second);
            } catch (GeneralSecurityException e10) {
                throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f172351d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(b.FLOAT.e());
            byteBufferAllocate.putFloat(f10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(b.INT.e());
            byteBufferAllocate.putInt(i10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(b.LONG.e());
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
            byteBufferAllocate.putInt(b.STRING.e());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new C5604b<>();
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
            byteBufferAllocate.putInt(b.STRING_SET.e());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f172348a.g(str)) {
                this.f172349b.remove(this.f172348a.d(str));
                this.f172350c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }

        SharedPreferencesEditorC2779a(SharedPreferencesC18442a sharedPreferencesC18442a, SharedPreferences.Editor editor) {
            this.f172348a = sharedPreferencesC18442a;
            this.f172349b = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f172349b.apply();
            b();
            this.f172350c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f172349b.commit();
            } finally {
                b();
                this.f172350c.clear();
            }
        }
    }

    /* renamed from: z4.a$b */
    private enum b {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f172359a;

        public static b b(int i10) {
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
            return this.f172359a;
        }

        b(int i10) {
            this.f172359a = i10;
        }
    }

    @Deprecated
    /* renamed from: z4.a$c */
    public enum c {
        AES256_SIV("AES256_SIV");


        /* renamed from: a, reason: collision with root package name */
        private final String f172362a;

        m b() throws GeneralSecurityException {
            return n.a(this.f172362a);
        }

        c(String str) {
            this.f172362a = str;
        }
    }

    @Deprecated
    /* renamed from: z4.a$d */
    public enum d {
        AES256_GCM("AES256_GCM");


        /* renamed from: a, reason: collision with root package name */
        private final String f172365a;

        m b() throws GeneralSecurityException {
            return n.a(this.f172365a);
        }

        d(String str) {
            this.f172365a = str;
        }
    }

    String c(String str) {
        try {
            String str2 = new String(this.f172347f.b(Xe.e.a(str, 0), this.f172344c.getBytes()), StandardCharsets.UTF_8);
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
            return Xe.e.d(this.f172347f.a(str.getBytes(StandardCharsets.UTF_8), this.f172344c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC2779a(this, this.f172342a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f172342a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String strC = c(entry.getKey());
                map.put(strC, f(strC));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f172343b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f172343b.remove(onSharedPreferenceChangeListener);
    }

    SharedPreferencesC18442a(String str, String str2, SharedPreferences sharedPreferences, InterfaceC3886a interfaceC3886a, InterfaceC3891f interfaceC3891f) {
        this.f172344c = str;
        this.f172342a = sharedPreferences;
        this.f172345d = str2;
        this.f172346e = interfaceC3886a;
        this.f172347f = interfaceC3891f;
    }

    public static SharedPreferences a(Context context, String str, z4.c cVar, c cVar2, d dVar) throws GeneralSecurityException, IOException {
        return b(str, cVar.a(), context, cVar2, dVar);
    }

    @Deprecated
    public static SharedPreferences b(String str, String str2, Context context, c cVar, d dVar) throws GeneralSecurityException, IOException {
        f.b();
        C4025a.c();
        Context applicationContext = context.getApplicationContext();
        p pVarE = new a.b().l(cVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().e();
        p pVarE2 = new a.b().l(dVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().e();
        return new SharedPreferencesC18442a(str, str2, applicationContext.getSharedPreferences(str, 0), (InterfaceC3886a) pVarE2.v(InterfaceC3886a.class), (InterfaceC3891f) pVarE.v(InterfaceC3891f.class));
    }

    private Object f(String str) throws SecurityException {
        if (!g(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String strD = d(str);
                String string = this.f172342a.getString(strD, null);
                if (string == null) {
                    return null;
                }
                boolean z10 = false;
                byte[] bArrA = Xe.e.a(string, 0);
                InterfaceC3886a interfaceC3886a = this.f172346e;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC3886a.b(bArrA, strD.getBytes(charset)));
                byteBufferWrap.position(0);
                int i10 = byteBufferWrap.getInt();
                b bVarB = b.b(i10);
                if (bVarB != null) {
                    int iOrdinal = bVarB.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    if (iOrdinal != 4) {
                                        if (iOrdinal == 5) {
                                            if (byteBufferWrap.get() != 0) {
                                                z10 = true;
                                            }
                                            return Boolean.valueOf(z10);
                                        }
                                        throw new SecurityException("Unhandled type for encrypted pref value: " + bVarB);
                                    }
                                    return Float.valueOf(byteBufferWrap.getFloat());
                                }
                                return Long.valueOf(byteBufferWrap.getLong());
                            }
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        C5604b c5604b = new C5604b();
                        while (byteBufferWrap.hasRemaining()) {
                            int i11 = byteBufferWrap.getInt();
                            ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                            byteBufferSlice.limit(i11);
                            byteBufferWrap.position(byteBufferWrap.position() + i11);
                            c5604b.add(StandardCharsets.UTF_8.decode(byteBufferSlice).toString());
                        }
                        if (c5604b.size() == 1 && "__NULL__".equals(c5604b.s(0))) {
                            return null;
                        }
                        return c5604b;
                    }
                    int i12 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                    byteBufferWrap.limit(i12);
                    String string2 = charset.decode(byteBufferSlice2).toString();
                    if (string2.equals("__NULL__")) {
                        return null;
                    }
                    return string2;
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
            return this.f172342a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    Pair<String, String> e(String str, byte[] bArr) throws GeneralSecurityException {
        String strD = d(str);
        return new Pair<>(strD, Xe.e.d(this.f172346e.a(bArr, strD.getBytes(StandardCharsets.UTF_8))));
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
        Set<String> c5604b;
        Object objF = f(str);
        if (objF instanceof Set) {
            c5604b = (Set) objF;
        } else {
            c5604b = new C5604b<>();
        }
        if (c5604b.size() > 0) {
            return c5604b;
        }
        return set;
    }
}
