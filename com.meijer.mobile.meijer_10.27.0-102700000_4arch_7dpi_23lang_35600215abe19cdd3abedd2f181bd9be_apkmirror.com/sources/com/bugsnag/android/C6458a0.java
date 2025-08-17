package com.bugsnag.android;

import Q6.ImmutableConfig;
import com.bugsnag.android.AbstractC6468f0;
import com.bugsnag.android.C6482m0;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bugsnag.android.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6458a0 extends AbstractC6468f0 {

    /* renamed from: n, reason: collision with root package name */
    static final Comparator<File> f63364n = new a();

    /* renamed from: o, reason: collision with root package name */
    private static long f63365o = 1048576;

    /* renamed from: h, reason: collision with root package name */
    private final ImmutableConfig f63366h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC6468f0.a f63367i;

    /* renamed from: j, reason: collision with root package name */
    private final B0 f63368j;

    /* renamed from: k, reason: collision with root package name */
    private final Q6.a f63369k;

    /* renamed from: l, reason: collision with root package name */
    private final CallbackState f63370l;

    /* renamed from: m, reason: collision with root package name */
    final InterfaceC6495t0 f63371m;

    /* renamed from: com.bugsnag.android.a0$a */
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
            return file.compareTo(file2);
        }

        a() {
        }
    }

    /* renamed from: com.bugsnag.android.a0$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6458a0.this.n();
        }
    }

    /* renamed from: com.bugsnag.android.a0$c */
    class c implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63373a;

        c(String str) {
            this.f63373a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            C6458a0.this.m(new File(this.f63373a));
            return this.f63373a;
        }
    }

    /* renamed from: com.bugsnag.android.a0$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            List<File> listE = C6458a0.this.e();
            if (listE.isEmpty()) {
                C6458a0.this.f63371m.d("No regular events to flush to Bugsnag.");
            }
            C6458a0.this.p(listE);
        }
    }

    @Override // com.bugsnag.android.AbstractC6468f0
    String f(Object obj) {
        return EventFilenameInfo.c(obj, null, this.f63366h).a();
    }

    /* renamed from: com.bugsnag.android.a0$e */
    static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63376a;

        static {
            int[] iArr = new int[H.values().length];
            f63376a = iArr;
            try {
                iArr[H.DELIVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63376a[H.UNDELIVERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63376a[H.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C6458a0(ImmutableConfig immutableConfig, InterfaceC6495t0 interfaceC6495t0, B0 b02, Q6.a aVar, AbstractC6468f0.a aVar2, CallbackState callbackState) {
        super(new File(immutableConfig.v().getValue(), "bugsnag-errors"), immutableConfig.getMaxPersistedEvents(), f63364n, interfaceC6495t0, aVar2);
        this.f63366h = immutableConfig;
        this.f63371m = interfaceC6495t0;
        this.f63367i = aVar2;
        this.f63368j = b02;
        this.f63369k = aVar;
        this.f63370l = callbackState;
    }

    private Y i(File file, String str) {
        C6499v0 c6499v0 = new C6499v0(file, str, this.f63371m);
        try {
            if (!this.f63370l.e(c6499v0, this.f63371m)) {
                return null;
            }
        } catch (Exception unused) {
            c6499v0.a();
        }
        V vB = c6499v0.getEvent();
        return vB != null ? new Y(vB.c(), vB, null, this.f63368j, this.f63366h) : new Y(str, null, file, this.f63368j, this.f63366h);
    }

    private void j(File file, Y y10) {
        int i10 = e.f63376a[this.f63366h.getDelivery().b(y10, this.f63366h.m(y10)).ordinal()];
        if (i10 == 1) {
            b(Collections.singleton(file));
            this.f63371m.f("Deleting sent error file " + file.getName());
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            s(new RuntimeException("Failed to deliver event payload"), file);
            return;
        }
        if (t(file)) {
            this.f63371m.g("Discarding over-sized event (" + file.length() + ") after failed delivery");
            b(Collections.singleton(file));
            return;
        }
        if (!u(file)) {
            a(Collections.singleton(file));
            this.f63371m.g("Could not send previously saved error(s) to Bugsnag, will try again later");
            return;
        }
        this.f63371m.g("Discarding historical event (from " + q(file) + ") after failed delivery");
        b(Collections.singleton(file));
    }

    private void s(Exception exc, File file) {
        AbstractC6468f0.a aVar = this.f63367i;
        if (aVar != null) {
            aVar.a(exc, file, "Crash Report Deserialization");
        }
        b(Collections.singleton(file));
    }

    File k(Collection<File> collection) {
        ArrayList arrayList = new ArrayList();
        for (File file : collection) {
            if (EventFilenameInfo.d(file, this.f63366h).g()) {
                arrayList.add(file);
            }
        }
        Collections.sort(arrayList, f63364n);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (File) arrayList.get(arrayList.size() - 1);
    }

    void l() {
        try {
            this.f63369k.c(Q6.n.ERROR_REQUEST, new d());
        } catch (RejectedExecutionException unused) {
            this.f63371m.g("Failed to flush all on-disk errors, retaining unsent errors for later.");
        }
    }

    void m(File file) {
        try {
            Y yI = i(file, EventFilenameInfo.d(file, this.f63366h).getApiKey());
            if (yI == null) {
                b(Collections.singleton(file));
            } else {
                j(file, yI);
            }
        } catch (Exception e10) {
            s(e10, file);
        }
    }

    void o() {
        Future<?> futureC;
        if (this.f63366h.getSendLaunchCrashesSynchronously()) {
            try {
                futureC = this.f63369k.c(Q6.n.ERROR_REQUEST, new b());
            } catch (RejectedExecutionException e10) {
                this.f63371m.a("Failed to flush launch crash reports, continuing.", e10);
                futureC = null;
            }
            if (futureC != null) {
                try {
                    futureC.get(2000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e11) {
                    this.f63371m.a("Failed to send launch crash reports within 2s timeout, continuing.", e11);
                }
            }
        }
    }

    public Date q(File file) {
        return new Date(EventFilenameInfo.b(file));
    }

    String r(Object obj, String str) {
        return EventFilenameInfo.c(obj, str, this.f63366h).a();
    }

    void n() {
        List<File> listE = e();
        File fileK = k(listE);
        if (fileK != null) {
            listE.remove(fileK);
        }
        a(listE);
        if (fileK != null) {
            this.f63371m.f("Attempting to send the most recent launch crash report");
            p(Collections.singletonList(fileK));
            this.f63371m.f("Continuing with Bugsnag initialisation");
            return;
        }
        this.f63371m.d("No startupcrash events to flush to Bugsnag.");
    }

    void p(Collection<File> collection) {
        if (!collection.isEmpty()) {
            int size = collection.size();
            this.f63371m.f("Sending " + size + " saved error(s) to Bugsnag");
            Iterator<File> it = collection.iterator();
            while (it.hasNext()) {
                m(it.next());
            }
        }
    }

    public boolean t(File file) {
        if (file.length() > f63365o) {
            return true;
        }
        return false;
    }

    public boolean u(File file) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        if (EventFilenameInfo.b(file) < calendar.getTimeInMillis()) {
            return true;
        }
        return false;
    }

    Future<String> v(C6482m0.a aVar) {
        String strH = h(aVar);
        if (strH != null) {
            try {
                return this.f63369k.d(Q6.n.ERROR_REQUEST, new c(strH));
            } catch (RejectedExecutionException unused) {
                this.f63371m.g("Failed to flush all on-disk errors, retaining unsent errors for later.");
                return null;
            }
        }
        return null;
    }
}
