package F9;

import android.content.Context;
import android.content.SharedPreferences;
import b9.C6214c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b.\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u00102\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"LF9/e;", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "context", "", "fileName", "Lb9/c;", "sharedPreferenceCrypto", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lb9/c;)V", "value", "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "getAll", "()Ljava/util/Map;", "key", "defValue", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "defValues", "getStringSet", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "", "getFloat", "(Ljava/lang/String;F)F", "", "getBoolean", "(Ljava/lang/String;Z)Z", "contains", "(Ljava/lang/String;)Z", "Landroid/content/SharedPreferences$Editor;", "edit", "()Landroid/content/SharedPreferences$Editor;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "listener", "", "registerOnSharedPreferenceChangeListener", "(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V", "unregisterOnSharedPreferenceChangeListener", "Lb9/c;", "b", "Landroid/content/SharedPreferences;", "realPreferences", "c", "Landroid/content/SharedPreferences$Editor;", "editor", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class e implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6214c sharedPreferenceCrypto;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences realPreferences;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences.Editor editor;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"LF9/e$a;", "Landroid/content/SharedPreferences$Editor;", "Landroid/content/SharedPreferences;", "realPreferences", "Lb9/c;", "sharedPreferenceCrypto", "<init>", "(Landroid/content/SharedPreferences;Lb9/c;)V", "", "value", "a", "(Ljava/lang/String;)Ljava/lang/String;", "key", "putString", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "", "putInt", "(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;", "", "putBoolean", "(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;", "remove", "(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "clear", "()Landroid/content/SharedPreferences$Editor;", "commit", "()Z", "", "putFloat", "(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;", "", "putLong", "(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;", "", "values", "putStringSet", "(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;", "", "apply", "()V", "Lb9/c;", "b", "Landroid/content/SharedPreferences$Editor;", "editor", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C6214c sharedPreferenceCrypto;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final SharedPreferences.Editor editor;

        public a(SharedPreferences realPreferences, C6214c sharedPreferenceCrypto) {
            Intrinsics.j(realPreferences, "realPreferences");
            Intrinsics.j(sharedPreferenceCrypto, "sharedPreferenceCrypto");
            this.sharedPreferenceCrypto = sharedPreferenceCrypto;
            SharedPreferences.Editor editorEdit = realPreferences.edit();
            Intrinsics.i(editorEdit, "edit(...)");
            this.editor = editorEdit;
        }

        private final String a(String value) {
            if (value == null) {
                return null;
            }
            return this.sharedPreferenceCrypto.c(value);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            this.editor.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.editor.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return this.editor.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String key, boolean value) {
            Intrinsics.j(key, "key");
            this.editor.putBoolean(key, value);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String key, float value) {
            Intrinsics.j(key, "key");
            this.editor.putFloat(key, value);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String key, int value) {
            Intrinsics.j(key, "key");
            this.editor.putInt(key, value);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String key, long value) {
            Intrinsics.j(key, "key");
            this.editor.putLong(key, value);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String key, String value) {
            Intrinsics.j(key, "key");
            this.editor.putString(key, a(value));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String key, Set<String> values) {
            Set<String> setN1;
            Intrinsics.j(key, "key");
            SharedPreferences.Editor editor = this.editor;
            if (values != null) {
                Set<String> set = values;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(a((String) it.next()));
                }
                setN1 = CollectionsKt.n1(arrayList);
            } else {
                setN1 = null;
            }
            editor.putStringSet(key, setN1);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String key) {
            Intrinsics.j(key, "key");
            this.editor.remove(key);
            return this;
        }
    }

    public e(Context context, String fileName, C6214c sharedPreferenceCrypto) {
        Intrinsics.j(context, "context");
        Intrinsics.j(fileName, "fileName");
        Intrinsics.j(sharedPreferenceCrypto, "sharedPreferenceCrypto");
        this.sharedPreferenceCrypto = sharedPreferenceCrypto;
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        Intrinsics.i(sharedPreferences, "getSharedPreferences(...)");
        this.realPreferences = sharedPreferences;
        this.editor = new a(sharedPreferences, sharedPreferenceCrypto);
    }

    private final String a(String value) {
        return this.sharedPreferenceCrypto.b(value);
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String key) {
        return this.realPreferences.contains(key);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        Map<String, ?> all = this.realPreferences.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.g(all);
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                linkedHashMap.put(key, a((String) value));
            } else if (value instanceof Integer) {
                linkedHashMap.put(key, value);
            } else if (value instanceof Boolean) {
                linkedHashMap.put(key, value);
            } else if (value instanceof Float) {
                linkedHashMap.put(key, value);
            } else if (value instanceof Long) {
                linkedHashMap.put(key, value);
            } else if (value instanceof Set) {
                Intrinsics.h(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                Set set = (Set) value;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(a((String) it.next()));
                }
                linkedHashMap.put(key, CollectionsKt.o1(arrayList));
            }
        }
        return linkedHashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String key, boolean defValue) {
        return this.realPreferences.getBoolean(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String key, float defValue) {
        return this.realPreferences.getFloat(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String key, int defValue) {
        return this.realPreferences.getInt(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String key, long defValue) {
        return this.realPreferences.getLong(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public String getString(String key, String defValue) {
        String strA;
        Intrinsics.j(key, "key");
        String string = this.realPreferences.getString(key, null);
        return (string == null || (strA = a(string)) == null) ? defValue : strA;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String key, Set<String> defValues) {
        Set<String> stringSet = this.realPreferences.getStringSet(key, null);
        if (stringSet != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : stringSet) {
                Intrinsics.g(str);
                String strA = a(str);
                if (strA != null) {
                    arrayList.add(strA);
                }
            }
            Set<String> setN1 = CollectionsKt.n1(arrayList);
            if (setN1 != null) {
                return setN1;
            }
        }
        return defValues;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        this.realPreferences.registerOnSharedPreferenceChangeListener(listener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        this.realPreferences.unregisterOnSharedPreferenceChangeListener(listener);
    }
}
