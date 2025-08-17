package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.r;
import gd.C14250i;

/* loaded from: classes4.dex */
public abstract class RemoteCreator<T> {
    private final String zza;
    private Object zzb;

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    protected RemoteCreator(String str) {
        this.zza = str;
    }

    protected abstract T getRemoteCreator(IBinder iBinder);

    protected final T getRemoteCreatorInstance(Context context) throws RemoteCreatorException {
        if (this.zzb == null) {
            r.l(context);
            Context contextC = C14250i.c(context);
            if (contextC == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) contextC.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new RemoteCreatorException("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new RemoteCreatorException("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new RemoteCreatorException("Could not instantiate creator.", e12);
            }
        }
        return (T) this.zzb;
    }
}
