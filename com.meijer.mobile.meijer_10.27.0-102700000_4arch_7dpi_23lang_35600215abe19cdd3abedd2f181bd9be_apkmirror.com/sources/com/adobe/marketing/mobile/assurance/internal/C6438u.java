package com.adobe.marketing.mobile.assurance.internal;

import android.os.Process;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6438u implements r {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f62288d = Pattern.compile("^\\[ \\d\\d-\\d\\d \\d\\d:\\d\\d:\\d\\d.\\d\\d\\d {1,}\\d+: {0,}\\d+ [VDIWEAF]/[^ ]+ {1,}]$");

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f62289a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f62290b = false;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference<C6442y> f62291c = new AtomicReference<>(null);

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.u$b */
    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            String line;
            try {
                Process processStart = new ProcessBuilder(new String[0]).command("logcat", "-P", "").start();
                Process processStart2 = new ProcessBuilder(new String[0]).command("logcat", String.format("--pid=%s", Integer.valueOf(Process.myPid())), "-bmain", "-vlong").start();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart2.getInputStream()));
                StringBuilder sb2 = new StringBuilder();
                boolean z10 = true;
                while (C6438u.this.f62290b && !Thread.interrupted()) {
                    try {
                        line = bufferedReader.readLine();
                    } catch (Exception e10) {
                        Q5.t.b("Assurance", "AssurancePluginLogForwarder", String.format("Log forwarding error reading line: %s", e10.getLocalizedMessage()), new Object[0]);
                    }
                    if (line == null || !line.contains("Assurance")) {
                        if (line != null && C6438u.this.m(line)) {
                            if (z10) {
                                z10 = false;
                            } else if (!C6438u.this.n(sb2)) {
                                HashMap map = new HashMap();
                                map.put("logline", sb2.toString());
                                C6430l c6430l = new C6430l("log", map);
                                C6442y c6442y = (C6442y) C6438u.this.f62291c.get();
                                if (c6442y != null) {
                                    c6442y.u(c6430l);
                                }
                                sb2.setLength(0);
                            }
                        }
                        if (line != null && !line.isEmpty()) {
                            sb2.append(line);
                            sb2.append("\n");
                        }
                    }
                }
                processStart.destroy();
                processStart2.destroy();
            } catch (Exception e11) {
                Q5.t.b("Assurance", "AssurancePluginLogForwarder", String.format("Log forwarding error while sending logs: %s" + e11.getLocalizedMessage(), new Object[0]), new Object[0]);
            }
            C6438u.this.f62289a = false;
        }
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void a() {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void f(int i10) {
        this.f62290b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(String str) {
        return f62288d.matcher(str).matches();
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void b() {
        this.f62291c.set(null);
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public String c() {
        return "com.adobe.griffon.mobile";
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public String d() {
        return "logForwarding";
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void g(C6442y c6442y) {
        this.f62291c.set(c6442y);
    }

    C6438u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(StringBuilder sb2) {
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length < 2) {
            return true;
        }
        return strArrSplit[1].equals("");
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void e(C6430l c6430l) {
        HashMap<String, Object> mapA = c6430l.a();
        if (F.h(mapA)) {
            Q5.t.f("Assurance", "AssurancePluginLogForwarder", "Invalid details in payload. Ignoring to enable/disable logs.", new Object[0]);
            return;
        }
        Object obj = mapA.get("enable");
        if (!(obj instanceof Boolean)) {
            Q5.t.f("Assurance", "AssurancePluginLogForwarder", "Unable to forward the log, logForwardingValue is invalid", new Object[0]);
            return;
        }
        this.f62290b = ((Boolean) obj).booleanValue();
        C6442y c6442y = this.f62291c.get();
        if (this.f62290b) {
            if (c6442y != null) {
                c6442y.o(EnumC6429k.HIGH, "Received Assurance command to start forwarding logs");
            }
            if (!this.f62289a) {
                this.f62289a = true;
                new Thread(new b()).start();
                return;
            }
            return;
        }
        if (c6442y != null) {
            c6442y.o(EnumC6429k.HIGH, "Received Assurance command to stop forwarding logs");
        }
    }
}
