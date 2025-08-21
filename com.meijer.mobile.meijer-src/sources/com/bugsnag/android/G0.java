package com.bugsnag.android;

import com.bugsnag.android.e1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/G0;", "Lcom/bugsnag/android/m;", "<init>", "()V", "", "memoryTrimLevel", "", "b", "(Ljava/lang/Integer;)Ljava/lang/String;", "newTrimLevel", "", "h", "(Ljava/lang/Integer;)Z", "", "c", "a", "Z", "f", "()Z", "g", "(Z)V", "isLowMemory", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "setMemoryTrimLevel", "(Ljava/lang/Integer;)V", "e", "()Ljava/lang/String;", "trimLevelDescription", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class G0 extends C6606m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isLowMemory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer memoryTrimLevel;

    private final String b(Integer memoryTrimLevel) {
        if (memoryTrimLevel == null) {
            return "None";
        }
        if (memoryTrimLevel.intValue() == 80) {
            return "Complete";
        }
        if (memoryTrimLevel.intValue() == 60) {
            return "Moderate";
        }
        if (memoryTrimLevel.intValue() == 40) {
            return "Background";
        }
        if (memoryTrimLevel.intValue() == 20) {
            return "UI hidden";
        }
        if (memoryTrimLevel.intValue() == 15) {
            return "Running critical";
        }
        if (memoryTrimLevel.intValue() == 10) {
            return "Running low";
        }
        if (memoryTrimLevel.intValue() == 5) {
            return "Running moderate";
        }
        return "Unknown (" + memoryTrimLevel + ')';
    }

    /* renamed from: d, reason: from getter */
    public final Integer getMemoryTrimLevel() {
        return this.memoryTrimLevel;
    }

    public final String e() {
        return b(this.memoryTrimLevel);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsLowMemory() {
        return this.isLowMemory;
    }

    public final void g(boolean z10) {
        this.isLowMemory = z10;
    }

    public final boolean h(Integer newTrimLevel) {
        if (Intrinsics.e(this.memoryTrimLevel, newTrimLevel)) {
            return false;
        }
        this.memoryTrimLevel = newTrimLevel;
        return true;
    }

    public final void c() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            e1.q qVar = new e1.q(getIsLowMemory(), getMemoryTrimLevel(), e());
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((R6.r) it.next()).onStateChange(qVar);
            }
        }
    }
}
