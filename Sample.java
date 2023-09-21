interface Library{
                    public void readBook();
                    public void setBookMark();
}
abstract class NonFiction implements Library{ //line 1
                    public void readBook() {}
                    //line 2
}
abstract class Biography extends NonFiction { // line 3
                    public void readBook() {} 
                    //line 4
}