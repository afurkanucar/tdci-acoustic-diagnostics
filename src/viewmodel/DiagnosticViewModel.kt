class DiagnosticViewModel : ViewModel() {
    private val _engineStatus = MutableLiveData<String>()
    val engineStatus: LiveData<String> = _engineStatus

    fun startAcousticAnalysis() {
        viewModelScope.launch(Dispatchers.IO) {
            // Ses verisini analiz et ve sonucu arayüze (UI) güvenli bir şekilde gönder
            val result = audioProcessor.analyze(1.4, "TDCi")
            _engineStatus.postValue(result)
        }
    }
}

