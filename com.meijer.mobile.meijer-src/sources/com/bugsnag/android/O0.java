package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R0\u0010 \u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/bugsnag/android/O0;", "", "<init>", "()V", "Lcom/bugsnag/android/v0;", "writer", "", "obj", "", "shouldRedactKeys", "", "e", "(Lcom/bugsnag/android/v0;Ljava/util/Map;Z)V", "", "b", "(Lcom/bugsnag/android/v0;Ljava/util/Collection;)V", "a", "(Lcom/bugsnag/android/v0;Ljava/lang/Object;)V", "", "key", "d", "(Ljava/lang/String;)Z", "f", "(Ljava/lang/Object;Lcom/bugsnag/android/v0;Z)V", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "h", "(Ljava/util/Set;)V", "redactedKeys", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class O0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Set<Pattern> f63976c = SetsKt.d(Pattern.compile(".*password.*", 2));

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Set<Pattern> redactedKeys = f63976c;

    private final boolean d(String key) {
        Set<Pattern> set = this.redactedKeys;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(key).matches()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void g(O0 o02, Object obj, C6624v0 c6624v0, boolean z10, int i10, Object obj2) throws IOException {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        o02.f(obj, c6624v0, z10);
    }

    public final Set<Pattern> c() {
        return this.redactedKeys;
    }

    public final void f(Object obj, C6624v0 writer, boolean shouldRedactKeys) throws IOException {
        if (obj == null) {
            writer.p();
            return;
        }
        if (obj instanceof String) {
            writer.O((String) obj);
            return;
        }
        if (obj instanceof Number) {
            writer.K((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            writer.R(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof C6624v0.a) {
            ((C6624v0.a) obj).toStream(writer);
            return;
        }
        if (obj instanceof Date) {
            writer.O(R6.g.c((Date) obj));
            return;
        }
        if (obj instanceof Map) {
            e(writer, (Map) obj, shouldRedactKeys);
            return;
        }
        if (obj instanceof Collection) {
            b(writer, (Collection) obj);
        } else if (obj.getClass().isArray()) {
            a(writer, obj);
        } else {
            writer.O("[OBJECT]");
        }
    }

    public final void h(Set<Pattern> set) {
        this.redactedKeys = set;
    }

    private final void a(C6624v0 writer, Object obj) throws IOException {
        writer.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            g(this, Array.get(obj, i10), writer, false, 4, null);
        }
        writer.h();
    }

    private final void b(C6624v0 writer, Collection<?> obj) throws IOException {
        writer.c();
        Iterator<T> it = obj.iterator();
        while (it.hasNext()) {
            g(this, it.next(), writer, false, 4, null);
        }
        writer.h();
    }

    private final void e(C6624v0 writer, Map<?, ?> obj, boolean shouldRedactKeys) throws IOException {
        writer.d();
        Iterator<T> it = obj.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (key instanceof String) {
                String str = (String) key;
                writer.l(str);
                if (shouldRedactKeys && d(str)) {
                    writer.O("[REDACTED]");
                } else {
                    f(entry.getValue(), writer, shouldRedactKeys);
                }
            }
        }
        writer.i();
    }
}
