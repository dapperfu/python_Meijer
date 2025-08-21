package H9;

import Ke.InterfaceC3886a;
import Ke.InterfaceC3891f;
import Ke.p;
import Le.C4025a;
import Se.a;
import android.content.Context;
import android.content.SharedPreferences;
import io.constructor.data.local.PreferencesHelper;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 @2\u00020\u0001:\u0003:\u000f3B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u00022\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020/2\u0006\u0010.\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u00101J\u0015\u00103\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b3\u0010\u0010J\u0015\u00104\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b4\u0010*J-\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002072\u0006\u0010\u0015\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010=R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010>R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010?¨\u0006A"}, d2 = {"LH9/f;", "Landroid/content/SharedPreferences;", "", "fileName", "sharedPreferences", "LKe/a;", "aead", "LKe/f;", "deterministicAead", "", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "listeners", "<init>", "(Ljava/lang/String;Landroid/content/SharedPreferences;LKe/a;LKe/f;Ljava/util/List;)V", "encryptedKey", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "", "getAll", "()Ljava/util/Map;", "key", "defValue", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "defValues", "getStringSet", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "", "getFloat", "(Ljava/lang/String;F)F", "", "getBoolean", "(Ljava/lang/String;Z)Z", "contains", "(Ljava/lang/String;)Z", "Landroid/content/SharedPreferences$Editor;", "edit", "()Landroid/content/SharedPreferences$Editor;", "listener", "", "registerOnSharedPreferenceChangeListener", "(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V", "unregisterOnSharedPreferenceChangeListener", "c", "e", "", "value", "Lkotlin/Pair;", "d", "(Ljava/lang/String;[B)Lkotlin/Pair;", "a", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "LKe/a;", "LKe/f;", "Ljava/util/List;", "f", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class f implements SharedPreferences {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String fileName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3886a aead;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3891f deterministicAead;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<SharedPreferences.OnSharedPreferenceChangeListener> listeners;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"LH9/f$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "a", "(Ljava/lang/String;Landroid/content/Context;)Landroid/content/SharedPreferences;", "KEY_KEYSET_ALIAS", "Ljava/lang/String;", "VALUE_KEYSET_ALIAS", "NULL_VALUE", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: H9.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SharedPreferences a(String fileName, Context context) throws GeneralSecurityException {
            Intrinsics.j(fileName, "fileName");
            Intrinsics.j(context, "context");
            Qe.f.b();
            C4025a.c();
            Context applicationContext = context.getApplicationContext();
            p pVarE = new a.b().l(Ke.n.a("AES256_SIV")).n(applicationContext, "__emarsys_encrypted_prefs_key_keyset__", fileName).f().e();
            Intrinsics.i(pVarE, "getKeysetHandle(...)");
            p pVarE2 = new a.b().l(Ke.n.a("AES256_GCM")).n(applicationContext, "__emarsys_encrypted_prefs_value_keyset__", fileName).f().e();
            Intrinsics.i(pVarE2, "getKeysetHandle(...)");
            Object objV = pVarE.v(InterfaceC3891f.class);
            Intrinsics.i(objV, "getPrimitive(...)");
            InterfaceC3891f interfaceC3891f = (InterfaceC3891f) objV;
            Object objV2 = pVarE2.v(InterfaceC3886a.class);
            Intrinsics.i(objV2, "getPrimitive(...)");
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(fileName, 0);
            Intrinsics.i(sharedPreferences, "getSharedPreferences(...)");
            return new f(fileName, sharedPreferences, (InterfaceC3886a) objV2, interfaceC3891f, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\tJ!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010+R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"LH9/f$b;", "Landroid/content/SharedPreferences$Editor;", "LH9/f;", "encryptedSharedPreferences", "editor", "<init>", "(LH9/f;Landroid/content/SharedPreferences$Editor;)V", "", "a", "()V", "", "key", "", "value", "c", "(Ljava/lang/String;[B)V", "b", "putString", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "", "values", "putStringSet", "(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;", "", "putInt", "(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;", "", "putLong", "(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;", "", "putFloat", "(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;", "", "putBoolean", "(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;", "remove", "(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "clear", "()Landroid/content/SharedPreferences$Editor;", "commit", "()Z", "apply", "LH9/f;", "Landroid/content/SharedPreferences$Editor;", "", "Ljava/util/List;", "keysChanged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "clearRequested", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final f encryptedSharedPreferences;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final SharedPreferences.Editor editor;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<String> keysChanged;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final AtomicBoolean clearRequested;

        public b(f encryptedSharedPreferences, SharedPreferences.Editor editor) {
            Intrinsics.j(encryptedSharedPreferences, "encryptedSharedPreferences");
            Intrinsics.j(editor, "editor");
            this.encryptedSharedPreferences = encryptedSharedPreferences;
            this.editor = editor;
            this.keysChanged = new CopyOnWriteArrayList();
            this.clearRequested = new AtomicBoolean(false);
        }

        private final void a() {
            if (this.clearRequested.getAndSet(false)) {
                Set<String> setKeySet = this.encryptedSharedPreferences.getAll().keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    String str = (String) obj;
                    if (!this.keysChanged.contains(str) && this.encryptedSharedPreferences.e(str)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.editor.remove(this.encryptedSharedPreferences.c((String) it.next()));
                }
            }
        }

        private final void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.encryptedSharedPreferences.listeners) {
                Iterator<T> it = this.keysChanged.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.encryptedSharedPreferences, (String) it.next());
                }
            }
        }

        private final void c(String key, byte[] value) {
            if (this.encryptedSharedPreferences.e(key)) {
                throw new SecurityException(key + " is a reserved key for the encryption keyset.");
            }
            this.keysChanged.add(key);
            try {
                Pair<String, String> pairD = this.encryptedSharedPreferences.d(key, value);
                this.editor.putString(pairD.c(), pairD.d());
            } catch (GeneralSecurityException e10) {
                throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.clearRequested.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String key, boolean value) {
            Intrinsics.j(key, "key");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(c.f13469h.getId());
            byteBufferAllocate.put(value ? (byte) 1 : (byte) 0);
            byte[] bArrArray = byteBufferAllocate.array();
            Intrinsics.i(bArrArray, "array(...)");
            c(key, bArrArray);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String key, float value) {
            Intrinsics.j(key, "key");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.f13468g.getId());
            byteBufferAllocate.putFloat(value);
            byte[] bArrArray = byteBufferAllocate.array();
            Intrinsics.i(bArrArray, "array(...)");
            c(key, bArrArray);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String key, int value) {
            Intrinsics.j(key, "key");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.f13466e.getId());
            byteBufferAllocate.putInt(value);
            byte[] bArrArray = byteBufferAllocate.array();
            Intrinsics.i(bArrArray, "array(...)");
            c(key, bArrArray);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String key, long value) {
            Intrinsics.j(key, "key");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(c.f13467f.getId());
            byteBufferAllocate.putLong(value);
            byte[] bArrArray = byteBufferAllocate.array();
            Intrinsics.i(bArrArray, "array(...)");
            c(key, bArrArray);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String key, String value) {
            Intrinsics.j(key, "key");
            if (value == null) {
                value = "__NULL__";
            }
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.i(UTF_8, "UTF_8");
            byte[] bytes = value.getBytes(UTF_8);
            Intrinsics.i(bytes, "getBytes(...)");
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(c.f13464c.getId());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            byte[] bArrArray = byteBufferAllocate.array();
            Intrinsics.i(bArrArray, "array(...)");
            c(key, bArrArray);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String key, Set<String> values) {
            Intrinsics.j(key, "key");
            if (values == null) {
                values = SetsKt.g("__NULL__");
            }
            int size = (values.size() * 4) + 4;
            Set<String> set = values;
            ArrayList<byte[]> arrayList = new ArrayList(CollectionsKt.x(set, 10));
            for (String str : set) {
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.i(UTF_8, "UTF_8");
                byte[] bytes = str.getBytes(UTF_8);
                Intrinsics.i(bytes, "getBytes(...)");
                size += bytes.length;
                arrayList.add(bytes);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size);
            byteBufferAllocate.putInt(c.f13465d.getId());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            byte[] bArrArray = byteBufferAllocate.array();
            Intrinsics.i(bArrArray, "array(...)");
            c(key, bArrArray);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String key) {
            Intrinsics.j(key, "key");
            if (!this.encryptedSharedPreferences.e(key)) {
                this.editor.remove(this.encryptedSharedPreferences.c(key));
                this.keysChanged.remove(key);
                return this;
            }
            throw new SecurityException(key + " is a reserved key for the encryption keyset.");
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.editor.apply();
            b();
            this.keysChanged.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.editor.commit();
            } finally {
                b();
                this.keysChanged.clear();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LH9/f$c;", "", "", PreferencesHelper.PREF_ID, "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "e", "f", "g", "h", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE;

        /* renamed from: c, reason: collision with root package name */
        public static final c f13464c = new c("STRING", 0, 0);

        /* renamed from: d, reason: collision with root package name */
        public static final c f13465d = new c("STRING_SET", 1, 1);

        /* renamed from: e, reason: collision with root package name */
        public static final c f13466e = new c("INT", 2, 2);

        /* renamed from: f, reason: collision with root package name */
        public static final c f13467f = new c("LONG", 3, 3);

        /* renamed from: g, reason: collision with root package name */
        public static final c f13468g = new c("FLOAT", 4, 4);

        /* renamed from: h, reason: collision with root package name */
        public static final c f13469h = new c("BOOLEAN", 5, 5);

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ c[] f13470i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f13471j;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int id;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LH9/f$c$a;", "", "<init>", "()V", "", PreferencesHelper.PREF_ID, "LH9/f$c;", "a", "(I)LH9/f$c;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: H9.f$c$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final c a(int id2) {
                if (id2 == 0) {
                    return c.f13464c;
                }
                if (id2 == 1) {
                    return c.f13465d;
                }
                if (id2 == 2) {
                    return c.f13466e;
                }
                if (id2 == 3) {
                    return c.f13467f;
                }
                if (id2 == 4) {
                    return c.f13468g;
                }
                if (id2 != 5) {
                    return null;
                }
                return c.f13469h;
            }
        }

        static {
            c[] cVarArrA = a();
            f13470i = cVarArrA;
            f13471j = EnumEntriesKt.a(cVarArrA);
            INSTANCE = new Companion(null);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f13464c, f13465d, f13466e, f13467f, f13468g, f13469h};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f13470i.clone();
        }

        /* renamed from: b, reason: from getter */
        public final int getId() {
            return this.id;
        }

        private c(String str, int i10, int i11) {
            this.id = i11;
        }
    }

    private f(String str, SharedPreferences sharedPreferences, InterfaceC3886a interfaceC3886a, InterfaceC3891f interfaceC3891f, List<SharedPreferences.OnSharedPreferenceChangeListener> list) {
        this.fileName = str;
        this.sharedPreferences = sharedPreferences;
        this.aead = interfaceC3886a;
        this.deterministicAead = interfaceC3891f;
        this.listeners = list;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f13464c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f13466e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f13467f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.f13468g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.f13469h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.f13465d.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String b(String encryptedKey) {
        try {
            InterfaceC3891f interfaceC3891f = this.deterministicAead;
            byte[] bArrA = Xe.e.a(encryptedKey, 0);
            byte[] bytes = this.fileName.getBytes(Charsets.UTF_8);
            Intrinsics.i(bytes, "getBytes(...)");
            byte[] bArrB = interfaceC3891f.b(bArrA, bytes);
            Intrinsics.i(bArrB, "decryptDeterministically(...)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.i(UTF_8, "UTF_8");
            return new String(bArrB, UTF_8);
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    public final String c(String key) {
        Intrinsics.j(key, "key");
        try {
            InterfaceC3891f interfaceC3891f = this.deterministicAead;
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.i(UTF_8, "UTF_8");
            byte[] bytes = key.getBytes(UTF_8);
            Intrinsics.i(bytes, "getBytes(...)");
            byte[] bytes2 = this.fileName.getBytes(Charsets.UTF_8);
            Intrinsics.i(bytes2, "getBytes(...)");
            byte[] bArrA = interfaceC3891f.a(bytes, bytes2);
            Intrinsics.i(bArrA, "encryptDeterministically(...)");
            String strD = Xe.e.d(bArrA);
            Intrinsics.g(strD);
            return strD;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String key) {
        Intrinsics.j(key, "key");
        if (!e(key)) {
            return this.sharedPreferences.contains(c(key));
        }
        throw new SecurityException(key + " is a reserved key for the encryption keyset.");
    }

    public final Pair<String, String> d(String key, byte[] value) throws GeneralSecurityException {
        Intrinsics.j(key, "key");
        String strC = c(key);
        InterfaceC3886a interfaceC3886a = this.aead;
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.i(UTF_8, "UTF_8");
        byte[] bytes = strC.getBytes(UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        byte[] bArrA = interfaceC3886a.a(value, bytes);
        Intrinsics.i(bArrA, "encrypt(...)");
        return new Pair<>(strC, Xe.e.d(bArrA));
    }

    public final boolean e(String key) {
        Intrinsics.j(key, "key");
        return Intrinsics.e("__emarsys_encrypted_prefs_key_keyset__", key) || Intrinsics.e("__emarsys_encrypted_prefs_value_keyset__", key);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        Intrinsics.i(editorEdit, "edit(...)");
        return new b(this, editorEdit);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> getAll() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H9.f.getAll():java.util.Map");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean getBoolean(java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H9.f.getBoolean(java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getFloat(java.lang.String r9, float r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H9.f.getFloat(java.lang.String, float):float");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getInt(java.lang.String r9, int r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H9.f.getInt(java.lang.String, int):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long getLong(java.lang.String r9, long r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H9.f.getLong(java.lang.String, long):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getString(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H9.f.getString(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    @Override // android.content.SharedPreferences
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set<java.lang.String> getStringSet(java.lang.String r9, java.util.Set<java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H9.f.getStringSet(java.lang.String, java.util.Set):java.util.Set");
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        Intrinsics.j(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        Intrinsics.j(listener, "listener");
        this.listeners.remove(listener);
    }

    /* synthetic */ f(String str, SharedPreferences sharedPreferences, InterfaceC3886a interfaceC3886a, InterfaceC3891f interfaceC3891f, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, sharedPreferences, interfaceC3886a, interfaceC3891f, (i10 & 16) != 0 ? new ArrayList() : list);
    }
}
