package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import com.fullstory.FS;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10588m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Method f83104a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f83105b;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                FS.log_e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            declaredMethod = null;
        }
        f83104a = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                FS.log_e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f83105b = declaredMethod2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r3, android.app.job.JobInfo r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r5 = r3.getSystemService(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            java.lang.Object r5 = De.p.q(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            java.lang.reflect.Method r6 = com.google.android.gms.internal.measurement.C10588m0.f83104a
            if (r6 == 0) goto L6f
            java.lang.String r6 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = r3.checkSelfPermission(r6)
            if (r3 == 0) goto L1b
            goto L6f
        L1b:
            java.lang.reflect.Method r3 = com.google.android.gms.internal.measurement.C10588m0.f83105b
            r6 = 0
            if (r3 == 0) goto L34
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 0
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L32
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L32
            if (r3 == 0) goto L34
            int r3 = r3.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L32
            goto L45
        L30:
            r3 = move-exception
            goto L36
        L32:
            r3 = move-exception
            goto L36
        L34:
            r3 = r6
            goto L45
        L36:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L34
            java.lang.String r0 = "myUserId invocation illegal"
            com.fullstory.FS.log_e(r1, r0, r3)
            goto L34
        L45:
            java.lang.String r0 = "UploadAlarm"
            java.lang.String r1 = "com.google.android.gms"
            java.lang.reflect.Method r2 = com.google.android.gms.internal.measurement.C10588m0.f83104a
            if (r2 == 0) goto L6a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r1, r3, r0}     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            java.lang.Object r3 = r2.invoke(r5, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            if (r3 == 0) goto L6e
            int r6 = r3.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            goto L6e
        L62:
            r3 = move-exception
            goto L65
        L64:
            r3 = move-exception
        L65:
            java.lang.String r6 = "error calling scheduleAsPackage"
            com.fullstory.FS.log_e(r0, r6, r3)
        L6a:
            int r6 = r5.schedule(r4)
        L6e:
            return r6
        L6f:
            int r3 = r5.schedule(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C10588m0.a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
