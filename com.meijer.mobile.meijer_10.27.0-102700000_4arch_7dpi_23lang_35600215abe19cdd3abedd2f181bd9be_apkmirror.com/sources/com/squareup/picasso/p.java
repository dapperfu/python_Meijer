package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.o;
import com.squareup.picasso.v;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
class p extends ThreadPoolExecutor {

    private static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        private final c f126587a;

        public a(c cVar) {
            super(cVar, null);
            this.f126587a = cVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            o.f fVarO = this.f126587a.o();
            o.f fVarO2 = aVar.f126587a.o();
            return fVarO == fVarO2 ? this.f126587a.f126486a - aVar.f126587a.f126486a : fVarO2.ordinal() - fVarO.ordinal();
        }
    }

    void a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                b(4);
                return;
            } else {
                b(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                b(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        b(3);
                        break;
                    default:
                        b(3);
                        break;
                }
                return;
        }
        b(2);
    }

    p() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new v.f());
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }

    private void b(int i10) {
        setCorePoolSize(i10);
        setMaximumPoolSize(i10);
    }
}
