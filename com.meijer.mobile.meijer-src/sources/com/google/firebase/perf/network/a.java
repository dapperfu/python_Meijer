package com.google.firebase.perf.network;

import Xf.g;
import cg.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class a extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final c f89936a;

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.f89936a.f();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f89936a.r(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f89936a.S(i10);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f89936a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.f89936a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f89936a.c();
    }

    public boolean equals(Object obj) {
        return this.f89936a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f89936a.d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f89936a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.f89936a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f89936a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f89936a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f89936a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f89936a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f89936a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f89936a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f89936a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f89936a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f89936a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f89936a.q();
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f89936a.s(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f89936a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f89936a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f89936a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f89936a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f89936a.x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f89936a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.f89936a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f89936a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f89936a.B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.f89936a.C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.f89936a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f89936a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f89936a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f89936a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f89936a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.f89936a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.f89936a.J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f89936a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f89936a.L();
    }

    public int hashCode() {
        return this.f89936a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f89936a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f89936a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f89936a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f89936a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f89936a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f89936a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f89936a.T(j10);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f89936a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f89936a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f89936a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.f89936a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f89936a.Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f89936a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f89936a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f89936a.b0();
    }

    a(HttpURLConnection httpURLConnection, l lVar, g gVar) {
        super(httpURLConnection.getURL());
        this.f89936a = new c(httpURLConnection, lVar, gVar);
    }
}
