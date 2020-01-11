class RBI:
  def Interest(self):
    return input()

class SBIBank(RBI):
  def Interest(self):
    print("SBI Interest :", RBI.Interest(self))  

class IndianBank(RBI):
  def Interest(self):
    print("IndianBank Interest :", RBI.Interest(self))
    
class CanaraBank(RBI):
  def Interest(self):
    print("Canara Bank Interest :", RBI.Interest(self))
    
SBIBank().Interest()
IndianBank().Interest()
CanaraBank().Interest()