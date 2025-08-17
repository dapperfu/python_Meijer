package com.bugsnag.android;

import Q6.ImmutableConfig;
import com.bugsnag.android.AbstractC6468f0;
import java.io.File;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

/* loaded from: classes4.dex */
class N0 extends AbstractC6468f0 {

    /* renamed from: i, reason: collision with root package name */
    static final Comparator<File> f63156i = new a();

    /* renamed from: h, reason: collision with root package name */
    private final ImmutableConfig f63157h;

    class a implements Comparator<File> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
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

        a() {
        }
    }

    N0(ImmutableConfig immutableConfig, InterfaceC6495t0 interfaceC6495t0, AbstractC6468f0.a aVar) {
        super(new File(immutableConfig.v().getValue(), "bugsnag-sessions"), immutableConfig.getMaxPersistedSessions(), f63156i, interfaceC6495t0, aVar);
        this.f63157h = immutableConfig;
    }

    @Override // com.bugsnag.android.AbstractC6468f0
    String f(Object obj) {
        return SessionFilenameInfo.a(obj, this.f63157h).b();
    }

    public Date i(File file) {
        return new Date(SessionFilenameInfo.d(file));
    }

    public boolean j(File file) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        if (SessionFilenameInfo.d(file) < calendar.getTimeInMillis()) {
            return true;
        }
        return false;
    }
}
