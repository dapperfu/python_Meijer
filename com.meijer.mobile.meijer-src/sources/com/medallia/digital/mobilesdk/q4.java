package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes8.dex */
class q4 {

    /* renamed from: f, reason: collision with root package name */
    private static final String f93568f = "LocalBroadcastManager";

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f93569g = false;

    /* renamed from: h, reason: collision with root package name */
    static final int f93570h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f93571i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static q4 f93572j;

    /* renamed from: a, reason: collision with root package name */
    private final Context f93573a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f93574b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f93575c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f93576d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f93577e;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                q4.this.a();
            } else {
                super.handleMessage(message);
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f93579a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f93580b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f93579a = intent;
            this.f93580b = arrayList;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f93581a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f93582b;

        /* renamed from: c, reason: collision with root package name */
        boolean f93583c;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f93581a = intentFilter;
            this.f93582b = broadcastReceiver;
        }

        public String toString() {
            return "Receiver{" + this.f93582b + " filter=" + this.f93581a + "}";
        }
    }

    private q4(Context context) {
        this.f93573a = context;
        this.f93577e = new a(context.getMainLooper());
    }

    public static q4 a(Context context) {
        q4 q4Var;
        synchronized (f93571i) {
            try {
                if (f93572j == null) {
                    f93572j = new q4(context.getApplicationContext());
                }
                q4Var = f93572j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q4Var;
    }

    public void b(Intent intent) {
        if (a(intent)) {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f93574b) {
                try {
                    size = this.f93576d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f93576d.toArray(bVarArr);
                    this.f93576d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                for (int i11 = 0; i11 < bVar.f93580b.size(); i11++) {
                    bVar.f93580b.get(i11).f93582b.onReceive(this.f93573a, bVar.f93579a);
                }
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f93574b) {
            try {
                ArrayList<IntentFilter> arrayListRemove = this.f93574b.remove(broadcastReceiver);
                if (arrayListRemove != null) {
                    for (int i10 = 0; i10 < arrayListRemove.size(); i10++) {
                        IntentFilter intentFilter = arrayListRemove.get(i10);
                        for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                            String action = intentFilter.getAction(i11);
                            ArrayList<c> arrayList = this.f93575c.get(action);
                            if (arrayList != null) {
                                int i12 = 0;
                                while (i12 < arrayList.size()) {
                                    if (arrayList.get(i12).f93582b == broadcastReceiver) {
                                        arrayList.remove(i12);
                                        i12--;
                                    }
                                    i12++;
                                }
                                if (arrayList.size() <= 0) {
                                    this.f93575c.remove(action);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f93574b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<IntentFilter> arrayList = this.f93574b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f93574b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<c> arrayList2 = this.f93575c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f93575c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(Intent intent) {
        int i10;
        String str;
        String str2;
        synchronized (this.f93574b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f93573a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    FS.log_v(f93568f, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList = this.f93575c.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        FS.log_v(f93568f, "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        c cVar = arrayList.get(i11);
                        if (z10) {
                            StringBuilder sb2 = new StringBuilder();
                            i10 = i11;
                            sb2.append("Matching against filter ");
                            sb2.append(cVar.f93581a);
                            FS.log_v(f93568f, sb2.toString());
                        } else {
                            i10 = i11;
                        }
                        if (!cVar.f93583c) {
                            int iMatch = cVar.f93581a.match(action, strResolveTypeIfNeeded, scheme, data, categories, f93568f);
                            if (iMatch >= 0) {
                                if (z10) {
                                    StringBuilder sb3 = new StringBuilder();
                                    str = action;
                                    sb3.append("Filter matched! match=0x");
                                    sb3.append(Integer.toHexString(iMatch));
                                    FS.log_v(f93568f, sb3.toString());
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.f93583c = true;
                            } else {
                                str = action;
                                if (z10) {
                                    str2 = "Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category");
                                    FS.log_v(f93568f, str2);
                                }
                            }
                        } else if (z10) {
                            str2 = "Filter's target already added";
                            str = action;
                            FS.log_v(f93568f, str2);
                        } else {
                            str = action;
                        }
                        i11 = i10 + 1;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            ((c) arrayList2.get(i12)).f93583c = false;
                        }
                        this.f93576d.add(new b(intent, arrayList2));
                        if (!this.f93577e.hasMessages(1)) {
                            this.f93577e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
