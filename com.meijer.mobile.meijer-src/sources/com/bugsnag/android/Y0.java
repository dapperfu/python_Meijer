package com.bugsnag.android;

import com.bugsnag.android.AbstractC6613p0;
import com.bugsnag.android.SessionFilenameInfo;
import java.io.File;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/Y0;", "Lcom/bugsnag/android/p0;", "Ljava/io/File;", "bugsnagDir", "", "maxPersistedSessions", "", "apiKey", "Lcom/bugsnag/android/D0;", "logger", "Lcom/bugsnag/android/p0$a;", "delegate", "<init>", "(Ljava/io/File;ILjava/lang/String;Lcom/bugsnag/android/D0;Lcom/bugsnag/android/p0$a;)V", "file", "", "o", "(Ljava/io/File;)Z", "Ljava/util/Date;", "n", "(Ljava/io/File;)Ljava/util/Date;", "", "obj", "f", "(Ljava/lang/Object;)Ljava/lang/String;", "g", "Ljava/lang/String;", "h", "a", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Y0 extends AbstractC6613p0 {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<? super File> f64062i = new Comparator() { // from class: com.bugsnag.android.X0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Y0.m((File) obj, (File) obj2);
        }
    };

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String apiKey;

    public Y0(File file, int i10, String str, D0 d02, AbstractC6613p0.a aVar) {
        super(new File(file, "sessions"), i10, d02, aVar);
        this.apiKey = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(File file, File file2) {
        if (file == null && file2 == null) {
            return 0;
        }
        if (file == null) {
            return 1;
        }
        if (file2 == null) {
            return -1;
        }
        return file.getName().compareTo(file2.getName());
    }

    @Override // com.bugsnag.android.AbstractC6613p0
    public String f(Object obj) {
        return SessionFilenameInfo.INSTANCE.a(obj, this.apiKey).a();
    }

    public final Date n(File file) {
        SessionFilenameInfo.Companion companion = SessionFilenameInfo.INSTANCE;
        Intrinsics.g(file);
        return new Date(companion.c(file));
    }

    public final boolean o(File file) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        SessionFilenameInfo.Companion companion = SessionFilenameInfo.INSTANCE;
        Intrinsics.g(file);
        if (companion.c(file) < calendar.getTimeInMillis()) {
            return true;
        }
        return false;
    }
}
